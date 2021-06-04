package br.com.dealmachine.mvc.aoe.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dealmachine.mvc.aoe.dto.OrderFormDTO;
import br.com.dealmachine.mvc.aoe.model.OrderArt;
import br.com.dealmachine.mvc.aoe.model.User;
import br.com.dealmachine.mvc.aoe.repository.OrderArtRepository;
import br.com.dealmachine.mvc.aoe.repository.UserRepository;

@Controller
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	private OrderArtRepository orderRepository;
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("orderform")
	public String form(OrderFormDTO orderFormDTO) {
		
		return "orderform";
	}
	
	@PostMapping("new")
	public String newOrder(@Valid OrderFormDTO  orderFormDTO, BindingResult result) {
		if(result.hasErrors()) {
			return "orderform";
		}
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.findByUsername(username);
		
		OrderArt orderArt = orderFormDTO.toOrderArt();
		orderArt.setUser(user);
		
		orderRepository.save(orderArt);
				
		return "redirect:/home";
	}
}
