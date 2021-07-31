package design.patterns.behavior.iterator.system;

import java.util.ArrayList;
import java.util.Iterator;

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
        return menus.iterator();
    }
}
