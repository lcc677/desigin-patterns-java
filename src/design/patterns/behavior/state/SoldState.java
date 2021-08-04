package design.patterns.behavior.state;

// 发放糖果状态
public class SoldState implements State{
	GumballMechine gumballMechine;
	
	
	public SoldState(GumballMechine gumballMechine) {
		this.gumballMechine = gumballMechine;
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
	public void turnGrank() {
		// TODO Auto-generated method stub
		System.out.println("在售状态，你已经转动把手了，不能再转动了，即使多次转动我也只能给你一个糖果");
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
		System.out.println("在售状态，在出糖果了，开心么，出完糖果，我又得变状态了");
		
		gumballMechine.releaseGumball();
		if(gumballMechine.getCount()<=0) {
			System.out.println("----没糖了，我只能变成售罄状态");	
			gumballMechine.setState(gumballMechine.getSoldOutState());
		}else {
			System.out.println("----还有糖了，我要变成无硬币状态");
			gumballMechine.setState(gumballMechine.getNoQuarterState());
		}
		
	}
}
