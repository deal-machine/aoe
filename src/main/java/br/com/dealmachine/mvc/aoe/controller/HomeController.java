package br.com.dealmachine.mvc.aoe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dealmachine.mvc.aoe.model.OrderArt;
import br.com.dealmachine.mvc.aoe.model.Status;
import br.com.dealmachine.mvc.aoe.repository.OrderArtRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private OrderArtRepository orderRepository = null;
	
	@GetMapping
	public String home(Model model) {
		List<OrderArt> orderArts = orderRepository.findAll();
		
		model.addAttribute("orders", orderArts);
		
		return "home";
	}
	
	@GetMapping("/{status}")
	public String getOrdersByStatus(@PathVariable("status") String status, Model model) {
		List<OrderArt> orderArts = orderRepository.findByStatus(Status.valueOf(status.toUpperCase()));
		
		model.addAttribute("orders", orderArts);
		model.addAttribute("status", status);
		
		return "home";
	}
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}
}
