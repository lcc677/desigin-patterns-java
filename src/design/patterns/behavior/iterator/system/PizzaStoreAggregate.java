package design.patterns.behavior.iterator.system;

import java.util.Iterator;

public class PizzaStoreAggregate implements Aggregate {
    public Menu[] menus;
    public int numberOfItems = 0;

    public PizzaStoreAggregate() {
        this.menus = new Menu[20];
    }

    @Override
    public void add(Menu menu) {
        menus[numberOfItems] = menu;
        numberOfItems += 1;
    }

    @Override
    public void remove(Menu menu) {
        for (int i = 0; i < menus.length; i++) {
            if (menu.equals(menus[i])) {
                menus[i] = null;
                break;
            }
        }
    }

    @Override
    public Iterator getIterator() {
        return new PizzaStoreIterator(menus);
    }
}
