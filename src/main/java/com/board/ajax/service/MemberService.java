package com.board.ajax.service;

import java.util.List;

import com.board.ajax.dto.MemberDTO;

// 인터페이스 
public interface MemberService {
	List<MemberDTO> getMemberList();
	List<MemberDTO> getSearchMemberList(String member_name);

}
