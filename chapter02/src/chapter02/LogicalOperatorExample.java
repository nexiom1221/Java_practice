package chapter02;

public class LogicalOperatorExample {
public static void main(String[] args) {
	int charCode = 'A';
	
	if((charCode>=65) && (charCode<=90)) {
		System.out.println("대문자 이군요");
	}
	else if((charCode>=97) && (charCode<=122)){
		System.out.println("소문자 이군요");
	}
	else {
		System.out.println("0~9 숫자 이군요");
	}
	
	//----------------------------------------------
	
	int value = 6;
	
	if((value%2==0) | (value%3==0)) {
		System.out.println("2또는 3의 배수 이군요");
	}
	else {
		System.out.println("2또는 3의 배수가 아니군요");
	}
	
	//----------------------------------------------
	int score =55;
	char grade = (score>90) ? 'A' : ((score > 80)? 'B': (score>70)?'C':'F');
	System.out.println(score + "점은 " + grade + "등급입니다.");
	
	
	
	
}
}
