package design.patterns.behavior.proxy.remote;

// 默认状态，没有投币
public class NoQuarterState implements State {
	transient GumballMachine gumballMachine;
	

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("无硬币状态，投币成功，我要变成有硬币状态。。。 ");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("无硬币状态，你不能退回硬币的哦！！！ ");
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("无硬币状态，你要先投币才行的哦！！！ ");
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("无硬币状态，没给钱，你就想吃糖！！ ");
		
	}

}
