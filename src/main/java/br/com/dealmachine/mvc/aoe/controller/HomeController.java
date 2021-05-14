package br.com.dealmachine.mvc.aoe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.dealmachine.mvc.aoe.model.OrderArt;
import br.com.dealmachine.mvc.aoe.repository.OrderArtRepository;

@Controller
public class HomeController {
	
	@Autowired
	private OrderArtRepository orderRepository = null;

	@GetMapping("/home")
	public String home(Model model) {
		
		List<OrderArt> orderArts = orderRepository.getOrders();
		
		model.addAttribute("orders", orderArts);
		
		return "home";
	}
}
