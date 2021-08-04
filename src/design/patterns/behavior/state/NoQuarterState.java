package design.patterns.behavior.state;

// 默认状态，没有投币
public class NoQuarterState implements State{
	GumballMechine gumballMechine;
	

	public NoQuarterState(GumballMechine gumballMechine) {
		this.gumballMechine = gumballMechine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("无硬币状态，投币成功，我要变成有硬币状态。。。 ");
		gumballMechine.setState(gumballMechine.getHasQuarterState());
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("无硬币状态，你不能退回硬币的哦！！！ ");
		
	}

	@Override
	public void turnGrank() {
		// TODO Auto-generated method stub
		System.out.println("无硬币状态，你要先投币才行的哦！！！ ");
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("无硬币状态，没给钱，你就想吃糖！！ ");
		
	}

}
