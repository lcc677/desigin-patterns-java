package design.patterns.behavior.mediator;

public class Seller extends Person {

	public Seller(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Send(String message) {
		// TODO Auto-generated method stub
		getReceiveArea().append("我："+message + "\n");
		getMediator().sendMessage(getName(), message);
	}

	@Override
	public void receive(String message) {
		// TODO Auto-generated method stub
		getReceiveArea().append(message + "\n");
	}
	

}
