package kr.co.ezenac.total;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("jump 못해요.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 못해요.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****초급자 레벨이에요*****");
		
	}

}
