package design.patterns.structure.composite;

import java.util.Iterator;

public class NullIterator implements Iterator{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		System.out.println("nullIterator");
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
