package com.board.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.ajax.dto.ReplyDTO;
import com.board.ajax.service.ReplyService;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyService replyService;
	
	@RequestMapping("/replyList")
	@ResponseBody
	public List<ReplyDTO> replyList() {
		List<ReplyDTO> replyList = replyService.getReplyList();
		System.out.println("여기는 컨트롤러" + replyList);
		return replyList;
	}
	
	@RequestMapping("/replyAdd")
	@ResponseBody
	public String replyAdd(ReplyDTO replyDTO){
		System.out.println("댓글 입력 데이터" + replyDTO);
		String replyResult = replyService.getReplyAdd(replyDTO.getMember_id(), replyDTO.getReply_content().toString());
		System.out.println(replyResult);
		return replyResult;
	}
		

	
}
	
	
	
	
	
	

