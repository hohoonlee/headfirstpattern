package ch11;

import java.rmi.Naming;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		int count = 0;
		if(args.length < 2) {
			System.out.println("GumballMachineTestDrive <name> <inventory>");
			System.exit(1);
		}

		try {
			count = Integer.parseInt(args[1]);
			GumballMachine machine = new GumballMachine(args[0], count);

			//GumballMonitor monitor = new GumballMonitor(machine);
			//monitor.report();
			Naming.rebind(args[0] + "/gumballmachine", machine);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
