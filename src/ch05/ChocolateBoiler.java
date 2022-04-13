package ch05;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile static ChocolateBoiler instance;

	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}

	public static ChocolateBoiler newInstance() {
		if(instance == null) {
			synchronized (ChocolateBoiler.class) {
				if(instance == null) instance = new ChocolateBoiler();
			}
		}
		return instance;
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
