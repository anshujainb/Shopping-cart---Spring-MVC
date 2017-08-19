package com.service;

import java.util.List;

import com.model.Cart;

public interface Iservice {
public List<Cart> getCartList();
	
	public Cart addCart(Cart cart);
	
	public Cart editCart(int id);
	
	public Cart DeleteCart(int id);
	public Cart getcart(int id);
}
