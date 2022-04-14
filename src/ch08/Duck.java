package ch08;

public class Duck implements Comparable<Duck> {
	String name;
	int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}

	public int compareTo(Duck other) {
		return this.weight - other.weight;
	}

}
