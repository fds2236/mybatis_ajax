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
    	if(memberMapper.idCheck(member_id).equals(null)) {
    		return true;
    	} else {
    		return false;
    	}	
    }
}