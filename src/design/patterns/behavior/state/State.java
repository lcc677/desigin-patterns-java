package design.patterns.behavior.state;

public interface State {
	void insertQuarter(); //投入硬币
	void ejectQuarter(); // 退回硬币
	void turnGrank(); // 转动把手
	void dispense(); // 发放糖果
}
