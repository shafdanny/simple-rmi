package com.shafiqdaniel.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;

public class Main {

    public static void main(String[] args)  {
        // Start a registry
        Registry reg = null;
        try {
            reg = LocateRegistry.getRegistry(8080);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        // Create the distant object
        ObjetDistant od = null;
        try {
            od = new ObjetDistant();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        // Register the object in registry
        try {
            reg.rebind("Hello", od);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
