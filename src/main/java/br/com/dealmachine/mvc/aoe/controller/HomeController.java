package br.com.dealmachine.mvc.aoe.controller;

import java.util.List;
import java.util.Arrays;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.dealmachine.mvc.aoe.model.Order;

@Controller
public class HomeController {

	
	@GetMapping("/home")
	public String home(Model model) {
		
		Order order = new Order();
		
		order.setName("Notebook Acer");
		//order.setDateDelivery("2007-12-03");
		order.setUrlImage("urlImage");
		order.setUrlProduct("urlProduct");
		order.setValue(15.10);	
		order.setDescription("Description");
		
		List<Order> orders = Arrays.asList(order);
		
		model.addAttribute("orders", orders);
		
		
		return "home";
	}
}
