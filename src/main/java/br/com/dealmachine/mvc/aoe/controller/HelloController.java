package br.com.dealmachine.mvc.aoe.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("hello")
	public String hello(HttpServletRequest request) {
		String name = "deal-machine";
		request.setAttribute("name", name);
		return "hello";
	}
}
