package design.patterns.behavior.state;

// 售罄状态
public class SoldOutState implements State{
	GumballMechine gumballMechine;
	
	public SoldOutState(GumballMechine gumballMechine) {
		this.gumballMechine = gumballMechine;
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
	public void turnGrank() {
		// TODO Auto-generated method stub
		System.out.println("机器售罄中，转动把手，没反应的");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("机器售罄中，没有糖果发放。");
		
	}

}
