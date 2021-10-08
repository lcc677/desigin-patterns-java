package design.patterns.behavior.memento;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caretaker caretaker = new Caretaker();
		
		Originator originator = new Originator();
		
		originator.setState("我现在满血");
		caretaker.addMemento("start", originator.setStateToMemento());
		
		originator.setState("我现在还有60%的血");
		caretaker.addMemento("part1", originator.setStateToMemento());
		
		originator.setState("我现在还有40%的血");
		caretaker.addMemento("part2", originator.setStateToMemento());
		
		System.out.println("我此时的状态:" + originator.getState());
		System.out.println("我喝了满血药了~~~~");
		originator.setStateFromMemento(caretaker.getMemento("start"));
		System.out.println("我此时的状态:" + originator.getState());
		
	}

}
