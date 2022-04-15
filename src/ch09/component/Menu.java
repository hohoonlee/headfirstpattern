package ch09.component;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
	List<MenuComponent> menuComponents = new ArrayList<>();
	String name;
	String description;
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
	@Override
	public String getDescription() {
		return this.description;
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("--------------------------------");

		for(MenuComponent component : menuComponents) {
			component.print();
		}
	}
	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}



}
