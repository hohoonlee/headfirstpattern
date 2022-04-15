package ch09;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem>{
	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public MenuItem next() {
		return items[position++];
	}

	public boolean hasNext() {
		if(position >= items.length || items[position] == null) return false;
		return true;
	}

	public void remove() {
		throw new UnsupportedOperationException("메뉴 항목은 지우면 안됩니다.");
	}
}
