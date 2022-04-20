package ch11.remote;

import java.rmi.Naming;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	public void go() {
		try {
			System.out.println("RUN");
			//MyRemote service = (MyRemote) Naming.lookup("rmi://218.38.137.28/RemoteHello");
			MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
			String s = service.sayHello();
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
