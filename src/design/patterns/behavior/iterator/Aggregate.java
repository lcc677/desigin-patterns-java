package design.patterns.behavior.iterator;

public interface Aggregate {
    void add(Menu menu);

    void remove(Menu menu);

    Iterator getIterator();

}
