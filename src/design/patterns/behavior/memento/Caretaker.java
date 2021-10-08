package design.patterns.behavior.memento;

import java.util.HashMap;

public class Caretaker {
	HashMap<String, Memento> mementoMap = new HashMap<>();
	
	public void addMemento(String key,Memento memento) {
		mementoMap.put(key, memento);
	}
	public Memento getMemento(String key) {
		return mementoMap.get(key);
		
	}
}
