package com.board.ajax.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.ajax.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	List<MemberDTO> memberList();
	List<MemberDTO> memberSearchList(String member_name);
	String idCheck(String member_id);
	MemberDTO memberListAdd(String member_name, String member_id, String member_pwd, String member_addr, String member_age, String member_gender);
}
