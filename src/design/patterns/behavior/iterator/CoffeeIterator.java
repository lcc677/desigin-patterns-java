package design.patterns.behavior.iterator;

import java.util.ArrayList;

/**
 * description: CoffeeIterator
 * date: 2021/7/31 下午4:25
 * author: cc
 */
public class CoffeeIterator implements Iterator {
    ArrayList<Menu> menus;
    int position = 0;

    public CoffeeIterator(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public boolean hasNext() {
        return position < menus.size();
    }

    @Override
    public Menu next() {
        Menu menu = menus.get(position);
        position += 1;
        return menu;
    }
}
