package design.patterns.behavior.iterator.system;

import java.util.Iterator;

public interface Aggregate {
    void add(Menu menu);

    void remove(Menu menu);

    Iterator<Menu> getIterator();

}
