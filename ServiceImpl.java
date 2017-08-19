package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.Idao;
import com.dto.CartFormConverter;
import com.model.Cart;

public class ServiceImpl implements Iservice{
	
	@Autowired
	Idao idao;

	public List<Cart> getCartList() {
		return idao.getCartList();
	}

	public Cart addCart(Cart cart) {
		return idao.addCart(CartFormConverter.transformcart(cart));
	}

	public Cart editCart(int id) {
		return idao.editCart(id);
	}

	public Cart DeleteCart(int id) {
		return idao.DeleteCart(id);
	}
	
	public Cart getcart(int id) {
		return idao.getCart(id);
	}

}
