package cn.gaoyuexiang.rmi.test.model;

import java.io.Serializable;

public class LoginResult implements Serializable {

	private static final long serialVersionUID = 1245372725497797920L;

	private Long id;

	private String token;

	private String status;

	public LoginResult() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoginResult{" +
			"id=" + id +
			", token='" + token + '\'' +
			", status='" + status + '\'' +
			'}';
	}
}
