package ch10;

public class SoldState implements State {
	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("알맹이를 내보내고 있습니다.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("이미 알맹이를 뽑으셨습니다.");
	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이는 한 번만 돌려 주세요.");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	@Override
	public void refill(int count) {
		System.out.println("볼을 채울 수 없습니다.");
	}

}
