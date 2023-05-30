package com.board.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.ajax.dto.ReplyDTO;
import com.board.ajax.service.ReplyService;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyService replyService;
	
	@GetMapping("/replyList")
	@ResponseBody
	public List<ReplyDTO> replyList() {
		List<ReplyDTO> replyList = replyService.getReplyList();
		System.out.println("여기는 컨트롤러" + replyList);
		return replyList;
	}
	
	@PostMapping("/replyAdd")
	@ResponseBody
	public String replyAdd(ReplyDTO replyDTO){
		System.out.println("댓글 입력 데이터" + replyDTO);
		String replyResult = replyService.getReplyAdd(replyDTO.getMember_id(), replyDTO.getReply_content().toString());
		System.out.println(replyResult);
		return replyResult;
	}
	
	@PostMapping("/replyDelete")
	@ResponseBody
	public String replyDelte(@RequestParam("reply_num")int reply_idx) {
		String replyResult = replyService.getReplyDelete(reply_idx);	
		return replyResult;
	}
	
	
		

	
}
	
	
	
	
	
	

