package ch09;

import java.util.List;

public class PancakeHouseIterator implements Iterator{
	List<MenuItem> menuItems;
	int position = 0;

	public PancakeHouseIterator(List<MenuItem> items) {
		this.menuItems = items;
	}

	public MenuItem next() {
		return menuItems.get(position++);
	}

	public boolean hasNext() {
		if(position >= menuItems.size() || menuItems.get(position) == null) return false;
		return true;
	}

}
