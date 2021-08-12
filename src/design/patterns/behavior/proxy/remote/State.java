package design.patterns.behavior.proxy.remote;

import java.io.Serializable;

public interface State extends Serializable {
	void insertQuarter(); //投入硬币
	void ejectQuarter(); // 退回硬币
	void turnCrank(); // 转动把手
	void dispense(); // 发放糖果
}
