package com.javaex.vo;

public class GuestBookVo {
	
	//필드
	private int no;
	private String name;
	private String password;
	private String content;
	private String Date;

	
	//생성자
	public GuestBookVo() {
	}

	public GuestBookVo(int no, String name, String password, String content, String Date) {
		this.no = no;
		this.name = name;
		this.password = password;
		this.content = content;
		this.Date = Date;
	}

	public GuestBookVo(String name, String password, String content) {
		this.name = name;
		this.password = password;
		this.content = content;
	}

	
	//메소드
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return Date;
	}

	public void setRegDate(String regDate) {
		this.Date = regDate;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", name=" + name + ", password=" + password + ", content=" + content
				+ ", regDate=" + Date + "]";
	}
}