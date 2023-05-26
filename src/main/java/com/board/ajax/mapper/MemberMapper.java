package com.board.ajax.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.ajax.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	List<MemberDTO> memberList();
	List<MemberDTO> memberSearchList(String member_name);
	String idCheck(String member_id);
}
