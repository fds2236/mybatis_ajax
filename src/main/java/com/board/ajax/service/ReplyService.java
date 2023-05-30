package com.board.ajax.service;

import java.util.List;

import com.board.ajax.dto.ReplyDTO;

public interface ReplyService {
	List<ReplyDTO> getReplyList(); 	// 댓글 조회
	String getReplyAdd(String member_id, String reply_content); // 댓글 삽입
}
