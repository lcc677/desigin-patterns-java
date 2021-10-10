package design.patterns.behavior.mediator;

public class Buyer extends Person{

	public Buyer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Send(String message) {
		// TODO Auto-generated method stub
		getReceiveArea().append("我:" + message + "\n");
		getMediator().sendMessage(getName(), message);
	}

	@Override
	public void receive(String from, String message) {
		// TODO Auto-generated method stub
		getReceiveArea().append(from+ ":" +message + "\n");
	}

}
