package com.example.demo.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="userdetail")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	int id;
	
	private String userid;
	@Column(nullable=false, length=50)
	private String uname;
	
	@Column(nullable=false, length=50)
	private String email;
	
	@Column(nullable=false, length=50)
	private String password;
	private String encryptedpassword;
	private String emailverificationtoken;
	
	@Column(nullable=false)
	private Boolean emailverificationstatus = false;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEncryptedpassword() {
		return encryptedpassword;
	}

	public void setEncryptedpassword(String encryptedpassword) {
		this.encryptedpassword = encryptedpassword;
	}

	public String getEmailverificationtoken() {
		return emailverificationtoken;
	}

	public void setEmailverificationtoken(String emailverificationtoken) {
		this.emailverificationtoken = emailverificationtoken;
	}

	public Boolean getEmailverificationstatus() {
		return emailverificationstatus;
	}

	public void setEmailverificationstatus(Boolean emailverificationstatus) {
		this.emailverificationstatus = emailverificationstatus;
	}
	
	

}
