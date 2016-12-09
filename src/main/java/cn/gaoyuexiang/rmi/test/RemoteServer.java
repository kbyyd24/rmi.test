package cn.gaoyuexiang.rmi.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import cn.gaoyuexiang.rmi.test.service.CheckService;
import cn.gaoyuexiang.rmi.test.service.LoginService;
import cn.gaoyuexiang.rmi.test.service.impl.CheckServiceImpl;
import cn.gaoyuexiang.rmi.test.service.impl.LoginServiceImpl;

public class RemoteServer {

	public static void main(String[] args) throws NamingException {
		CheckService checkService = new CheckServiceImpl();
		LoginService loginService = new LoginServiceImpl(checkService);
		Context context = new InitialContext();
		context.rebind("rmi://localhost/login", loginService);
		System.out.println("rebind rmi://localhost/login");
	}

}
