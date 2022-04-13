package ch03;

public abstract class Beverage {
	public enum Size {TALL, GRANDE, VENTI};
	Size size = Size.TALL;
	String decription = "untitle";

	public String getDescription() {
		return decription;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public abstract double cost();
}
