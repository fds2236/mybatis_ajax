package com.board.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.ajax.dto.MemberDTO;
import com.board.ajax.mapper.MemberMapper;
import com.board.ajax.service.MemberService;

@Controller
//@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	// 회원 리스트
	@RequestMapping("/list")
	public String memberList(Model model) {
		List<MemberDTO> memberList = memberService.getMemberList();
		System.out.println(memberList);
		model.addAttribute("memberList", memberList);
		return "memberList"; // 페이지 이동
	}
	
	// 회원 검색 get
	@GetMapping("/searchList")
	@ResponseBody
	public List<MemberDTO> searchMember(@RequestParam("user_name") String member_name) {
		System.out.println("요청 잘 들어오나요~~");
		List<MemberDTO> member = memberService.getMemberByName(member_name);
		System.out.println(member);
		return member;
	}
	
	@RequestMapping("/join")
	public String join() {
		return "join";
	}
	
	
	// 아이디 중복확인 get
	@GetMapping("/idCheck")
	@ResponseBody
	public boolean idCheck(@RequestParam("member_id")String user_id) {
		System.out.println(user_id);
		boolean idCheck = memberService.getIdCheck(user_id);
		System.out.println(idCheck);
		return idCheck;
	}
	
}
