package com.git.model.vo;

public class Member {
	
	private String mamberId;
	private String memberPwd;
	private String memberName;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String mamberId, String memberPwd, String memberName) {
		super();
		this.mamberId = mamberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
	}

	public String getMamberId() {
		return mamberId;
	}

	public void setMamberId(String mamberId) {
		this.mamberId = mamberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	

}
