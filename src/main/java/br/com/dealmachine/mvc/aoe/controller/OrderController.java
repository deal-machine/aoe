package br.com.dealmachine.mvc.aoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dealmachine.mvc.aoe.dto.OrderForm;
import br.com.dealmachine.mvc.aoe.model.OrderArt;
import br.com.dealmachine.mvc.aoe.repository.OrderArtRepository;

@Controller
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	private OrderArtRepository orderRepository;
	
	
	@GetMapping("form")
	public String form() {
		return "formulario";
	}
	
	@PostMapping("new")
	public String newOrder(OrderForm  orderForm) {
		
		OrderArt orderArt = orderForm.toOrderArt();
		
		orderRepository.save(orderArt);
				
		return "home";
	}
}
