package com.board.ajax.service;

import java.util.List;

import com.board.ajax.dto.MemberDTO;

// 인터페이스 
public interface MemberService {
	List<MemberDTO> getMemberList(); // 회원 리스트
	List<MemberDTO> getMemberByName(String member_name); // 회원 검색
	boolean getIdCheck(String member_id); // 아이디 중복 확인
	boolean getLogin(String member_id, String member_pwd); // 로그인

}
