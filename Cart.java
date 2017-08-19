package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



	@Entity
	@Table(name = "cart")
	public class Cart {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		

		@Column(name = "name")
		private String name;

		@OneToMany(cascade = CascadeType.ALL, mappedBy = "cart", fetch = FetchType.LAZY)
		private List<Item> item_list;
		
		public List<Item> getItem_list() {
			return item_list;
		}

		public void setItem_list(List<Item> item_list) {
			this.item_list = item_list;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
		




}
