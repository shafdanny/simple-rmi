package com.shafiqdaniel.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Shafiq Daniel on 21/03/16.
 */
public class ObjetDistant extends UnicastRemoteObject implements Distante{

    public ObjetDistant() throws RemoteException {}

    @Override
    public void echo() throws RemoteException {
        System.out.println("Echo RMI !");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String sayHello() throws RemoteException {
        return null;
    }
}
