package chapter02;

public class ifElseifExample {

	public static void main(String[] args) {

		int score = 75;
		
		if(score>=90) {
			System.out.println("점수: 90~100");
			System.out.println("등급은 A");
		} else if(score>=80) {
			System.out.println("점수: 80~89");
			System.out.println("등급은 B");
		} else if(score>=70) {
			System.out.println("점수: 70~79");
			System.out.println("등급은 C");
		} else {
			System.out.println("점수: 70 미만");
			System.out.println("등급은 D");
		}

	}

}
