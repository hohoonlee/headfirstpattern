package ch06.lib;

public class Stereo {
	private String label;

	public Stereo() {
		this.label = "";
	}

	public Stereo(String label) {
		this.label = label;
	}

	public void on() {
		System.out.println(this.label + "Stereo ON");
	}

	public void off() {
		System.out.println(this.label + "Stereo OFF");
	}

	public void setCd() {
		System.out.println(this.label + "Stereo set CD");
	}

	public void setDvd() {
		System.out.println(this.label + "Stereo set DVD");
	}

	public void setRadio() {
		System.out.println("Stereo set Radio");
	}

	public void setVolume(int volume) {
		System.out.println("Stereo set Volume : " + volume);
	}

}
