package cn.gaoyuexiang.rmi.test.model;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 6924322863486854218L;

	private String username;

	private String password;

	public User() {}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
