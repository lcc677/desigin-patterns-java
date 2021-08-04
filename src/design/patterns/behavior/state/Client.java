package design.patterns.behavior.state;

public class Client {
	public static void main(String[] args) {
		GumballMechine gumballMechine = new GumballMechine(10);
		
		gumballMechine.insertQuarter();
		gumballMechine.ejectQuarter();
		gumballMechine.insertQuarter();
		gumballMechine.turnGrank();
		
		
		
		
		
	}

}
