package com.dao;

import java.util.List;

import com.model.Cart;

public interface Idao {
public List<Cart> getCartList();
	
	public Cart addCart(Cart cart);
	
	public Cart editCart(int id);
	
	public Cart DeleteCart(int id);
	public Cart getCart(int id);
	
	//public Cart GetCartTotal(int id);
	
}
