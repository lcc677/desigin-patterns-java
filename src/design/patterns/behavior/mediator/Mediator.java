package design.patterns.behavior.mediator;

public interface Mediator {
	
	public void register(Person person);
	public void sendMessage(String name,String message);

}
