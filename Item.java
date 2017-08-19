package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


	@Entity
	@Table(name = "item")
	public class Item {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id")
		private int id;
		
		@Column(name = "price")
		private int price;
		
		@Column(name = "cartid", insertable = false, updatable = false)
		private int cartid;

		public int getCartid() {
			return cartid;
		}

		public void setCartid(int cartid) {
			this.cartid = cartid;
		}

		@Column(name = "item")
		private String item;

		@ManyToOne
		@JoinColumn(name = "cartid")
		private Cart cart;

		public int getid() {
			return id;
		}

		public void setid(int id) {
			this.id = id;
		}

		public String getitem() {
			return item;
		}

		

		public void setitem(String itemName) {
			 item= itemName;
		}

		

		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		


}
