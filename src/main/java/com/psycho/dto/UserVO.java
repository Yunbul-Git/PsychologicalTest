package com.psycho.dto;

public class UserVO {
	
	private int pt_num;
	private String pt_id;
	private String pt_pass;
	private int pt_gender;
	private int pt_year;
	private int pt_mon;
	private int pt_day;
	private int pt_auth;
	
	public UserVO() {
		super();
	}
	
	public UserVO(int pt_num, String pt_id, String pt_pass, int pt_gender, int pt_year, int pt_mon, int pt_day, int pt_auth) {
		super();
		this.pt_num = pt_num;
		this.pt_id = pt_id;
		this.pt_pass = pt_pass;
		this.pt_gender = pt_gender;
		this.pt_year = pt_year;
		this.pt_mon = pt_mon;
		this.pt_day = pt_day;
		this.pt_auth = pt_auth;
	}

	public int getPt_num() {
		return pt_num;
	}

	public void setPt_num(int pt_num) {
		this.pt_num = pt_num;
	}

	public String getPt_id() {
		return pt_id;
	}

	public void setPt_id(String pt_id) {
		this.pt_id = pt_id;
	}

	public String getPt_pass() {
		return pt_pass;
	}

	public void setPt_pass(String pt_pass) {
		this.pt_pass = pt_pass;
	}

	public int getPt_gender() {
		return pt_gender;
	}

	public void setPt_gender(int pt_gender) {
		this.pt_gender = pt_gender;
	}

	public int getPt_year() {
		return pt_year;
	}

	public void setPt_year(int pt_year) {
		this.pt_year = pt_year;
	}

	public int getPt_mon() {
		return pt_mon;
	}

	public void setPt_mon(int pt_mon) {
		this.pt_mon = pt_mon;
	}
	
	public int getPt_day() {
		return pt_day;
	}

	public void setPt_day(int pt_day) {
		this.pt_day = pt_day;
	}
	
	public int getPt_auth() {
		return pt_auth;
	}

	public void setPt_auth(int pt_auth) {
		this.pt_auth = pt_auth;
	}
	
	
	
}
