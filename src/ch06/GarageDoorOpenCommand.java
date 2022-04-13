package ch06;

import ch06.lib.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	GarageDoor door;

	public GarageDoorOpenCommand(GarageDoor door) {
		this.door = door;
	}

	public void execute() {
		this.door.up();
		this.door.stop();
		this.door.lightOn();
	}

}
