package com.shafiqdaniel.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;

/**
 * Created by user on 21/03/16.
 */
public class Client {
    public static void main(String[] args) {

        // Get the registry
        Registry reg = null;
        try {
            reg = LocateRegistry.getRegistry(8080);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        try {
            com.shafiqdaniel.server.Distante id = (com.shafiqdaniel.server.Distante)reg.lookup("Hello");
            System.out.println("Calling remote echo ...");
            id.echo();
            System.out.println("Finished call");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }

    }

}
