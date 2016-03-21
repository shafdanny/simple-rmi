package com.shafiqdaniel.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by user on 21/03/16.
 */
public interface Distante extends Remote{
    public void echo() throws RemoteException;
    public String sayHello() throws RemoteException;
}
