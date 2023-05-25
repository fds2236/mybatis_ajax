package com.board.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.ajax.dto.MemberDTO;
import com.board.ajax.mapper.MemberMapper;

@Controller
public class MemberController {
	
	@Autowired
	MemberMapper memberMapper;
	
	@RequestMapping("/")
	public String memberList() {
		
		List<MemberDTO> mem = memberMapper.memberList();
		System.out.println(mem);
		return "home";
	}
	


}
