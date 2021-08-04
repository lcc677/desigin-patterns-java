package design.patterns.behavior.state;

import java.util.Random;

// 有硬币状态
public class HasQuarterState implements State{
	Random random = new Random(System.currentTimeMillis());
	GumballMechine gumballMechine;
	

	public HasQuarterState(GumballMechine gumballMechine) {
		this.gumballMechine = gumballMechine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("有硬币状态，你不需要再投币了！！！");
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("有硬币状态，你要退回硬币..,我就变成无硬币状态了");
		gumballMechine.setState(gumballMechine.getNoQuarterState());
		
	}

	@Override
	public void turnGrank() {
		// TODO Auto-generated method stub
		System.out.println("有硬币状态，你要转动把手，我就要变成在售状态了。。。");
		int winner = random.nextInt(10);
		System.out.println(winner);
		System.out.println(winner%10);
		if(winner%10==0 && gumballMechine.getCount()>1) {
			System.out.println("11111111111111");
			gumballMechine.setState(gumballMechine.getWinnerState());	
		}else {
			gumballMechine.setState(gumballMechine.getSoldState());
		}
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("有硬币状态，你要先转动把手，我才能发放糖果，。");
		
	}

}
