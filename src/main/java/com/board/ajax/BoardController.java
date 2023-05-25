package com.board.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("/")
	public String root() {
		return "redirect:home";
	}
	
	@RequestMapping("/home")
	public String home() {
			return "home";
	}
}
