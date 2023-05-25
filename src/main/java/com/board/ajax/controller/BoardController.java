package com.board.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("/d")
	public String root() {
		return "redirect:home";
	}
	
	@RequestMapping("/home")
	public String home() {
			return "index";
	}
}
