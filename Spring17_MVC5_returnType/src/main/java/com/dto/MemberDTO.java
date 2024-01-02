package com.dto;

import java.util.List;

public class MemberDTO {

		String userid;
		String passwd;

		// 리스트

		List<String> email; // name= “email”
		
		public List<String> getEmail() {
			return email;
		}
		public void setEmail(List<String> email) {
			this.email = email;
		}
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getPasswd() {
			return passwd;
		}
		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}
		@Override
		public String toString() {
			return "MemberDTO [userid=" + userid + ", passwd=" + passwd + ", email=" + email + "]";
		}
		public MemberDTO() {
			// TODO Auto-generated constructor stub
		}
	}

