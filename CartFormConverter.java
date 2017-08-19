package com.dto;

import java.util.ArrayList;
import java.util.List;

import com.model.Cart;
import com.model.Item;

public class CartFormConverter {

	public static Cart transformcart(Cart cart){
		Cart cart1= new Cart();
		cart1.setName(cart.getName());
		cart1.setId(cart.getId());
		
		List<Item> item_list = new ArrayList<Item>();
		List<Item> newitemlist=cart.getItem_list();
		for(Item I:newitemlist){
			Item I2=new Item();
			I2.setid(I.getid());
			I2.setitem(I.getitem());
			I2.setPrice(I.getPrice());
			I2.setCart(cart1);
			item_list.add(I2);
		}
		cart1.setItem_list(item_list);
		return cart1;
		
	}

}
