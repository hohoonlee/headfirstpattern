package ch05;

public enum ChocolateBoilerEnum {
	INSTANCE;

	private boolean empty;
	private boolean boiled;

	private ChocolateBoilerEnum() {
		this.empty = true;
		this.boiled = false;
	}

	public void fill() {
		if(!isEmpty()) return;
		this.empty = false;
		this.boiled = false;
	}

	public void drain() {
		if(!isEmpty() && isBoiled()) {
			this.empty = true;
		}
	}

	public void boid() {
		if(!isEmpty() && !isBoiled()) {
			this.boiled = true;
		}
	}

	public boolean isEmpty() {
		return this.empty;
	}

	public boolean isBoiled() {
		return this.boiled;
	}

	@Override
	public String toString() {
		return "ChocolateBoiler [boiled=" + boiled + ", empty=" + empty + "]";
	}
}
