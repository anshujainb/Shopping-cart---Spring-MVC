package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Cart;

public class DaoImpl implements Idao {

	@Autowired
	SessionFactory hibernateSessionFactory;
	public List<Cart> getCartList() {
		Session session = hibernateSessionFactory.openSession();
		List<Cart> list = session.createCriteria(Cart.class).list();
		return list;
		
	}

	public Cart addCart(Cart cart) { 
		Session session =hibernateSessionFactory.openSession();
		session.saveOrUpdate(cart);
		session.beginTransaction().commit();
		return cart;
		
	}

	public Cart editCart(int id) {
		Session session =hibernateSessionFactory.openSession();
		System.out.println("edit dao");
		Cart cart = (Cart) session.load(Cart.class, id);
		session.beginTransaction().commit();
		session.flush();
		return cart;
	}

	public Cart DeleteCart(int id) {
		Session session =hibernateSessionFactory.openSession();
		Cart cart =(Cart) session.load(Cart.class, id);
		session.delete(cart);
		session.beginTransaction().commit();
		session.flush();
	    return cart;
	
	}

	public Cart getCart(int id) {
		Session session = hibernateSessionFactory.openSession();
		return (Cart) session.load(Cart.class, id);
	}

}
