package design.patterns.behavior.mediator;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator{
		
	public ArrayList<Person> persons = new ArrayList<>();

	@Override
	public void register(Person person) {
		// TODO Auto-generated method stub
		persons.add(person);
		person.setMediator(this);
	}

	@Override
	public void sendMessage(String name,String message) {
		// TODO Auto-generated method stub
		for(Person p:persons) {
			if(!name.equals(p.getName())) {
				p.receive(name + ":" + message);
			}
			
		}
		
	}
	

}
