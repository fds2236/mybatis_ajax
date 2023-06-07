package com.board.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@RequestMapping("/")
	public String root() {
		return "home";
	}
//	
//	@RequestMapping("/")
//	public 
//	
	
	
}
