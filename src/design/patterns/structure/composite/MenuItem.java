package design.patterns.structure.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
	private String name;
    private String description;
    private float price;
    private boolean vegetarian;
    

	public MenuItem(String name, String description, float price, boolean vegetarian) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public float getPrice() {
		return price;
	}
	
	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public void print() {
		System.out.print(" " + getName());
		if(isVegetarian()) {
			System.out.print("(V)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     ----" + getDescription());
	}

	@Override
	Iterator createIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
//		throw new UnsupportedOperationException();
//		return null;
	}
}
