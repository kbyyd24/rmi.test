package cn.gaoyuexiang.rmi.test.service.impl;

import java.rmi.RemoteException;

import cn.gaoyuexiang.rmi.test.model.LoginResult;
import cn.gaoyuexiang.rmi.test.model.User;
import cn.gaoyuexiang.rmi.test.service.CheckService;
import cn.gaoyuexiang.rmi.test.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private CheckService checkService;

	public LoginServiceImpl(CheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public String broadcast(String msg) throws RemoteException {
		return msg;
	}

	@Override
	public LoginResult login(String username, String password) throws RemoteException {
		boolean success = checkService.checkUser(new User(username, password));
		LoginResult result = new LoginResult();
		if (success) {
			result.setId(123L);
			result.setToken("fkajeioj23u3qr9023j23");
			result.setStatus("Login Success");
		} else {
			result.setStatus("Login Failed");
		}
		return result;
	}
}
