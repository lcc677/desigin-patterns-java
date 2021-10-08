package design.patterns.behavior.memento;

public class Originator {
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento setStateToMemento() {
		return new Memento(state);
	}
	
	public void setStateFromMemento(Memento memento) {
		state = memento.getState();
	}
	
}
