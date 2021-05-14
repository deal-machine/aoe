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
		order.setUrlImage("https://www.alura.com.br/assets/api/cursos/spring-mvc-thymeleaf-bootstrap.svg");
		order.setUrlProduct("https://static.javatpoint.com/images/logo/jtp_logo.png");
		order.setValue(15.10);	
		order.setDateDelivery("2021-05-14");
		order.setDescription("Description of this images and products");
		
		List<Order> orders = Arrays.asList(order);
		
		model.addAttribute("orders", orders);
		
		return "home";
	}
}
