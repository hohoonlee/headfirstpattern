package ch06.lib;

public class Light {
	private String label;

	public Light() {
		this.label = "Light";
	}

	public Light(String label) {
		this.label = label;
	}

	public void on() {
		System.out.println(this.label + " ON");
	}

	public void off() {
		System.out.println(this.label + " OFF");
	}
}
