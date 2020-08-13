package com.ywmobile.domain;

import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AL_USER")
public class User {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable = false, length = 20)
	private String partnerId;

	@Column(nullable = false)
	private String pwd;

	@Column(nullable = false)
	private String email;

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [partnerId = " + partnerId + ", pwd = " + pwd + ", email = " + email + "]";
	}
}
