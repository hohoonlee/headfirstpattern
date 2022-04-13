package ch06;

import ch06.lib.GarageDoor;
import ch06.lib.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();

		Light light = new Light();
		LightOffCommand ligthOn = new LightOffCommand(light);

		GarageDoor door = new GarageDoor();
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(door);

		remote.setCommandd(ligthOn);
		remote.buttonWasPressed();

		remote.setCommandd(garageOpen);
		remote.buttonWasPressed();
	}

}
