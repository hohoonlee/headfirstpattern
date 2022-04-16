package ch10;

public class SoldOutState implements State {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("볼이 없습니다.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("볼이 없습니다.");
	}

	@Override
	public void turnCrank() {
		System.out.println("볼이 없습니다.");
	}

	@Override
	public void dispense() {
		System.out.println("볼이 없습니다.");
	}

	@Override
	public void refill(int count) {
		gumballMachine.setCount(count);
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

}
