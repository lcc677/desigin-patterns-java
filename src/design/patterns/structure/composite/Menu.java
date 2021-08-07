package design.patterns.structure.composite;

import java.util.ArrayList;
import java.util.Iterator;


public class Menu extends MenuComponent{
	private ArrayList menuComponents = new ArrayList();
	private String name;
	private String descripiton;
	
	
	public Menu(String name,String descripiton) {
		this.name = name;
		this.descripiton = descripiton;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return descripiton;
	}
	
	@Override
	public boolean isVegetarian() {
		return false;
	}
	
	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------------");
		
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.print();
			
		}
		
	}

	@Override
	public void addMenu(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		
	}

	@Override
	public void removeMenu(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		menuComponents.remove(menuComponent);
		
	}

	@Override
	public MenuComponent getChild(int i) {
		// TODO Auto-generated method stub
		return (MenuComponent) menuComponents.get(i);
	}

	@Override
	Iterator createIterator() {
		// TODO Auto-generated method stub
		return new CompositeIterator(menuComponents.iterator());
	}

}
