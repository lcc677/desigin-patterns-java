package design.patterns.structure.composite;

import java.awt.Component;
import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		MenuComponent pizzaMunu =  new Menu("pizza菜单","我是一个pizza总菜单");
		MenuComponent coffeMenu =  new Menu("咖啡菜单","我是一个咖啡总菜单");
		
		
		MenuComponent allMenu = new Menu("所有菜单","我包含了全部的菜单");
		
//		allMenu.addMenu(pizzaMunu);
		allMenu.addMenu(coffeMenu);
		
		MenuComponent pizzaMenu1 = new MenuItem("pizza菜单1", "我是一个pizza下的菜单1", 11.2f, false);
		MenuComponent pizzaMenu2 = new MenuItem("pizza菜单2", "我是一个pizza下的菜单2", 13.2f, false);
		MenuComponent pizzaMenu3 = new MenuItem("pizza菜单3", "我是一个pizza下的菜单3", 11.3f, false);
		MenuComponent pizzaMenu4 = new MenuItem("pizza菜单4", "我是一个pizza下的菜单4", 11.4f, false);
		MenuComponent pizzaMenu5 = new MenuItem("pizza菜单5", "我是一个pizza下的菜单5", 11.5f, false);
		pizzaMunu.addMenu(pizzaMenu1);
		pizzaMunu.addMenu(pizzaMenu2);
		pizzaMunu.addMenu(pizzaMenu3);
		pizzaMunu.addMenu(pizzaMenu4);
		pizzaMunu.addMenu(pizzaMenu5);
		
		MenuComponent coffeMenu1 = new MenuItem("咖啡菜单1", "我是一个咖啡下的菜单1", 5.6f, true);
		MenuComponent coffeMenu2 = new MenuItem("咖啡菜单2", "我是一个咖啡下的菜单2", 5.6f, true);
		MenuComponent coffeMenu3 = new MenuItem("咖啡菜单3", "我是一个咖啡下的菜单3", 5.6f, true);
		MenuComponent coffeMenu4 = new MenuItem("咖啡菜单4", "我是一个咖啡下的菜单4", 5.6f, true);
		MenuComponent coffeMenu5 = new MenuItem("咖啡菜单5", "我是一个咖啡下的菜单5", 5.6f, false);
		MenuComponent coffeMenu6 = new Menu("咖啡菜单素菜菜单", "我是一个咖啡下的菜单6,我还有子菜单的");
		
		MenuComponent coffeMenu61 = new MenuItem("咖啡素菜菜单1", "我是一个咖啡下的素菜菜单1", 5.6f, true);
		MenuComponent coffeMenu62 = new MenuItem("咖啡素菜菜单2", "我是一个咖啡下的素菜菜单2", 5.6f, true);
		MenuComponent coffeMenu63 = new MenuItem("咖啡素菜菜单3", "我是一个咖啡下的素菜菜单3", 5.6f, true);
		coffeMenu6.addMenu(coffeMenu61);
		coffeMenu6.addMenu(coffeMenu62);
		coffeMenu6.addMenu(coffeMenu63);
		
		
		coffeMenu.addMenu(coffeMenu1);
		coffeMenu.addMenu(coffeMenu2);
		coffeMenu.addMenu(coffeMenu3);
		coffeMenu.addMenu(coffeMenu4);
		coffeMenu.addMenu(coffeMenu5);
//		coffeMenu.addMenu(coffeMenu6);
		
		
//		allMenu.print();
		
		// 迭代器循环
		
		Iterator iterator= allMenu.createIterator();
		while (iterator.hasNext()) {
			MenuComponent component = (MenuComponent) iterator.next();
//			System.out.println(component.getName());
//			component.print();
			if (component.isVegetarian()) {
				System.out.println(component.getName());
			}
			
		}
		
		
		
		
		
	}

}
