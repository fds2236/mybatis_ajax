package com.board.ajax.dto;

import lombok.Data;

@Data
public class MemberDTO {
	int member_idx;
	String member_name;
	String member_id;
	String member_pwd;
	String member_addr;
	String member_age;
	String member_gender;
}
