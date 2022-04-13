package ch06;

public class SimpleRemoteControl {
	Command slot;

	public void setCommandd(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}

}
