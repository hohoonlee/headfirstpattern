package ch11.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	private static final long serialVersionUID = 1L;

	public MyRemoteImpl() throws RemoteException {
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says, 'Hey'";
	}

	public static void main(String[] args) {
		try {
			//rmiregistry -J-Djava.rmi.useLocalHostName=true -J-Djava.rmi.server.hostname=localhost
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
			System.out.println("load");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
