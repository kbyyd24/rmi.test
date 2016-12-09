package cn.gaoyuexiang.rmi.test;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import javax.naming.NamingException;

import cn.gaoyuexiang.rmi.test.service.LoginService;
import cn.gaoyuexiang.rmi.test.service.impl.CheckServiceImpl;
import cn.gaoyuexiang.rmi.test.service.impl.LoginServiceImpl;

public class RemoteServer {

	public static void main(String[] args) throws NamingException, RemoteException, AlreadyBoundException {
		Registry registry = LocateRegistry.createRegistry(9000);
		LoginService service = new LoginServiceImpl(new CheckServiceImpl());
		Remote login = UnicastRemoteObject.exportObject(service, 9000);
		registry.bind("login", login);
		System.out.println("Server ready");
	}

}
