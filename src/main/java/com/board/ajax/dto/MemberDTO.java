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
	
	public MemberDTO() {}
	
	
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pwd() {
		return member_pwd;
	}
	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}
	public String getMember_addr() {
		return member_addr;
	}
	public void setMember_addr(String member_addr) {
		this.member_addr = member_addr;
	}
	public String getMember_age() {
		return member_age;
	}
	public void setMember_age(String member_age) {
		this.member_age = member_age;
	}
	public String getMember_gender() {
		return member_gender;
	}
	public void setMember_gender(String member_gender) {
		this.member_gender = member_gender;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [member_idx=" + member_idx + ", member_name=" + member_name + ", member_id=" + member_id
				+ ", member_pwd=" + member_pwd + ", member_addr=" + member_addr + ", member_age=" + member_age
				+ ", member_gender=" + member_gender + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
