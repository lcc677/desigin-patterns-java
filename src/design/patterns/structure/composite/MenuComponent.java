package design.patterns.structure.composite;

import java.util.Iterator;

public abstract class MenuComponent {
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public float getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	public void addMenu(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public void removeMenu(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	abstract Iterator createIterator(); 
}
