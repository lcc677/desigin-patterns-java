package design.patterns.behavior.proxy.remote;

// 售罄状态
public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("机器售罄中，投币没反应的");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("机器售罄中，没有硬币返回的");
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("机器售罄中，转动把手，没反应的");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("机器售罄中，没有糖果发放。");
		
	}

}
