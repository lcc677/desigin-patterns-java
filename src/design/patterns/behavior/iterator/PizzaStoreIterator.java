package design.patterns.behavior.iterator;

/**
 * description: PizzaStoreIterator
 * date: 2021/7/31 下午4:16
 * author: cc
 */
public class PizzaStoreIterator implements Iterator {
    Menu[] menus;
    int position = 0;

    public PizzaStoreIterator(Menu[] menus) {
        this.menus = menus;
    }

    @Override
    public boolean hasNext() {
        if (position > menus.length || menus[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Menu next() {
        Menu menu = menus[position];
        position +=1;
        return menu;
    }
}
