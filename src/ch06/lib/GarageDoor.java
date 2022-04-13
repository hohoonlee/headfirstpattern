package ch06.lib;

public class GarageDoor {
	private String label;

	public GarageDoor() {
		this.label = "Garage Door";
	}

	public GarageDoor(String label) {
		this.label = label;
	}

	public void up() {
		System.out.println(this.label + " up");
	}

	public void down() {
		System.out.println(this.label + " down");
	}

	public void stop() {
		System.out.println(this.label + " stop");
	}

	public void lightOn() {
		System.out.println(this.label + " light on");
	}

	public void lightOff() {
		System.out.println("Door light off");
	}

}
