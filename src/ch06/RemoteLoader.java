package ch06;

import ch06.lib.*;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenRoomLight = new Light("Kitchen");
		GarageDoor door = new GarageDoor("Garage");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenRoomLight);

		control.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		control.setCommand(1, kitchenLightOn, kitchenLightOff);

		System.out.println(control);

		control.onButtonWasPushed(0);
		control.onButtonWasPushed(1);
		control.offButtonWasPushed(0);
		control.offButtonWasPushed(1);
	}

}
