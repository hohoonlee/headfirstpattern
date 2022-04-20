package ch11;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
	public static void main(String[] args) {
		String[] location = {"rmi://localhost/siva6.com/gumballmachine"};

		GumballMonitor[] monitors = new GumballMonitor[location.length];
		for(int i = 0; i < location.length; i++) {
			try {
				GumballMachineRemote machine = (GumballMachineRemote)Naming.lookup(location[i]);
				monitors[i] = new GumballMonitor(machine);
				System.out.println(monitors[i]);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		for(int i = 0; i < monitors.length; i++) {
			monitors[i].report();
		}
	}
}
