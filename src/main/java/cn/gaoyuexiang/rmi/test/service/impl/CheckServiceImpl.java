package cn.gaoyuexiang.rmi.test.service.impl;

import cn.gaoyuexiang.rmi.test.model.User;
import cn.gaoyuexiang.rmi.test.service.CheckService;

public class CheckServiceImpl implements CheckService {
	@Override
	public boolean checkUser(User user) {
		return user.getUsername().equals("melo") && user.getPassword().equals("123");
	}
}
