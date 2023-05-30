package com.board.ajax.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.ajax.dto.ReplyDTO;

@Mapper
public interface ReplyMapper {
	List<ReplyDTO> replyList();
	int replyAdd(String member_id, String reply_content);
}
