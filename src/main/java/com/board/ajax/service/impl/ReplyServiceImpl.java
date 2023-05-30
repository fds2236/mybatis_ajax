package com.board.ajax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.ajax.dto.ReplyDTO;
import com.board.ajax.mapper.ReplyMapper;
import com.board.ajax.service.ReplyService;

@Service
public class ReplyServiceImpl implements ReplyService{
	@Autowired
	private ReplyMapper replyMapper;

	@Override
	public List<ReplyDTO> getReplyList() {
		return replyMapper.replyList();
	}

	@Override
	public String getReplyAdd(String member_id, String reply_content) {
		if(replyMapper.replyAdd(member_id, reply_content) == 1) {
			return "true";
		} else if(replyMapper.replyAdd(member_id, reply_content) == 0) {
			return "false";
		} else {
			return "false";
		}		
	}

	@Override
	public String getReplyDelete(int member_idx) {
		if(replyMapper.replyDelete(member_idx) == 1) {
		return "true";
		} else {
			return "false";
		}
	}
	
	
	

}
