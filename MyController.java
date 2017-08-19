package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Cart;
import com.model.Item;
import com.service.Iservice;

@Controller
public class MyController {

	@Autowired
	Iservice iservice;

	@RequestMapping(value = "cartPage")
	public String redirect(Model model) {

		Cart cart = new Cart();
		
		List<Item> item_list = new ArrayList<Item>();
		Item item = new Item();
		Item item2=new Item();
		item2.setCart(cart);
		item.setCart(cart);
		item_list.add(item);
		item_list.add(item2);
		
		cart.setItem_list(item_list);
		
		model.addAttribute("cart", cart);
		return "welcome";
	}

	@RequestMapping(value = "insert")
	public String saveCartRegister(ModelMap modelMap,
			@ModelAttribute("cart") Cart cart) {
		 iservice.addCart(cart);
		return "redirect:cartPage";
	}
	
	@ModelAttribute("cartList")
	public List<Cart> getCartList() {
		return iservice.getCartList();
	}

	@RequestMapping(value = "/deleteCart", method = RequestMethod.GET)
	public ModelAndView deleteCart(@RequestParam(value = "id") int id) {
		 iservice.DeleteCart(id);
		return new ModelAndView("redirect:index");

	}
	
	@RequestMapping(value = "/editCart", method = RequestMethod.GET)
	public ModelAndView editStudent(@RequestParam int id) {
		Cart cart1 = iservice.getcart(id);
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("cart", cart1);

		return model;
	}
	
	

}

