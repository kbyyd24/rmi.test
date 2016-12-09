package cn.gaoyuexiang.rmi.test.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import cn.gaoyuexiang.rmi.test.service.LoginService;

public class Client {

	private Client() {}

	public static void main(String[] args) throws RemoteException, NotBoundException {
		String host = "localhost";
		int port = 9000;
		Registry registry = LocateRegistry.getRegistry(host, port);
		LoginService login = (LoginService) registry.lookup("login");
		System.out.println(login.broadcast("hello"));
		System.out.println(login.login("username", "password"));
		System.out.println(login.login("melo", "123"));
	}

}
