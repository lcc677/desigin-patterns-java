package design.patterns.behavior.proxy.remote;

// 发放糖果状态
public class WinnerState implements State {
	GumballMachine gumballMachine;
	
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("在售状态，你不需要再投币，等糖果出来后再投币吧");
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("在售状态，你不能退回硬币。鱼与熊掌不可兼得");
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("在售状态，你已经转动把手了，不能再转动了，即使多次转动我也只能给你一个糖果");
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
		System.out.println("在售状态，恭喜你中奖了！！！，我又得变状态了");
		
		gumballMachine.releaseGumball();
		gumballMachine.releaseGumball();
		if(gumballMachine.getCount()<=0) {
			System.out.println("----没糖了，我只能变成售罄状态");	
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else {
			System.out.println("----还有糖了，我要变成无硬币状态");
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		
	}
	
	
	
}
