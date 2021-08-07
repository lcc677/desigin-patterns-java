package design.patterns.structure.composite;

import java.awt.Component;
import java.util.Iterator;

public class Client2 {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu =  new Menu("PANCAKE HOUSE MENE","Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERTMENU MENU", "Dessert of course");

		MenuComponent allMenu = new Menu("ALL MENUS","all menus combined");
		
		allMenu.addMenu(pancakeHouseMenu);
		allMenu.addMenu(dinerMenu);
		allMenu.addMenu(cafeMenu);
		
		dinerMenu.addMenu(new MenuItem("Pasta", "spaghetti with Marinara Sauce, and a slice of sourdough bread", 3.89f, true));
		dinerMenu.addMenu(dessertMenu);
		
		dessertMenu.addMenu(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", 1.59f, true));
		allMenu.print();
		Iterator iterator= allMenu.createIterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
//			System.out.println(component.getName());
//			component.print();
			if (menuComponent.isVegetarian()) {
				menuComponent.print();
				System.out.println(menuComponent.hashCode());
//				System.out.println("2323");
//				System.out.println(component.getName());
			}
			
		}
		
		
	}

}
