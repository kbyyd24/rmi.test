package cn.gaoyuexiang.rmi.test.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import cn.gaoyuexiang.rmi.test.model.LoginResult;
import cn.gaoyuexiang.rmi.test.model.User;

public interface LoginService extends Remote {

	String broadcast(String msg) throws RemoteException;

	LoginResult login(User user) throws RemoteException;

}
