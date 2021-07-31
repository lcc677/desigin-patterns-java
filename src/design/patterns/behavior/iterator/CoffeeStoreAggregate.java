package design.patterns.behavior.iterator;

import java.util.ArrayList;

/**
 * description: CoffeeStoreAggregate
 * date: 2021/7/31 下午4:28
 * author: cc
 */
public class CoffeeStoreAggregate implements Aggregate {
    ArrayList<Menu> menus = new ArrayList<>();

    @Override
    public void add(Menu menu) {
        menus.add(menu);
    }

    @Override
    public void remove(Menu menu) {
        menus.remove(menu);
    }

    @Override
    public Iterator getIterator() {
        return new CoffeeIterator(menus);
    }
}
