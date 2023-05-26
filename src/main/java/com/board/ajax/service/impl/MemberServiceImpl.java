package com.board.ajax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.ajax.dto.MemberDTO;
import com.board.ajax.mapper.MemberMapper;
import com.board.ajax.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<MemberDTO> getMemberList() {
        return memberMapper.memberList();
    }

    @Override
    public List<MemberDTO> getMemberByName(String member_name) {
        return memberMapper.memberSearchList(member_name);
    }
    
    @Override
    public boolean getIdCheck(String member_id) {
    	System.out.println("여기는 서비스 임플,,,,!");
    	if(memberMapper.idCheck(member_id)== null) {
    		System.out.println("없는 ID : 가입가능");
    		return true; // 가입 가능
    	} else {
    		System.out.println("이미 존재하는 ID : 가입불가");
    		return false; // 이미 존재하는 Id라 가입 불가
    	}	
    }
}