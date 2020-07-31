package com.psycho.dto;

public class UserDTO {
	
	private String pt_id;
	private String pt_pass;
	private int pt_auth;
	
	public UserDTO() {
		super();
	}
	public UserDTO(String pt_id, String pt_pass, int pt_auth) {
		super();
		this.pt_id = pt_id;
		this.pt_pass = pt_pass;
		this.pt_auth = pt_auth;
	}

	// getter & setter
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
	
	public int getPt_auth() {
		return pt_auth;
	}
	public void setPt_auth(int pt_auth) {
		this.pt_auth = pt_auth;
	}

}
