package design.patterns.behavior.iterator.system;

import java.util.Iterator;

/**
 * description: PizzaStoreIterator
 * date: 2021/7/31 下午4:16
 * author: cc
 */
public class PizzaStoreIterator implements Iterator<Menu> {
    Menu[] menus;
    int position = 0;

    public PizzaStoreIterator(Menu[] menus) {
        this.menus = menus;
    }

    @Override
    public boolean hasNext() {
        return position <= menus.length && menus[position] != null;
    }

    @Override
    public Menu next() {
        Menu menu = menus[position];
        position += 1;
        return menu;
    }
}
