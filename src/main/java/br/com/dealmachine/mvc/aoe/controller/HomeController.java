package br.com.dealmachine.mvc.aoe.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.dealmachine.mvc.aoe.model.OrderArt;

@Controller
public class HomeController {
	
	@PersistenceContext
	private EntityManager EntityManager;
	
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Query query = EntityManager.createQuery("select p from OrderArt p", OrderArt.class);
		List<OrderArt> orderArts = query.getResultList();
		
		
		
		model.addAttribute("orders", orderArts);
		
		return "home";
	}
}
