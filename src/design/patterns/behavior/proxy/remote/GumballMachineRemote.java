package design.patterns.behavior.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * description: GumballMachineRemote
 * date: 2021/8/11 下午1:24
 * author: cc
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}
