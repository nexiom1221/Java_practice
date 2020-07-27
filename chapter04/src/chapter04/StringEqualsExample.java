package chapter04;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "이순신";
		String strVar2 = "이순신";
		
		if(strVar1==strVar2) {
			System.out.println("참조가 같다.");
		} else {
			System.out.println("참조가 다르다.");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("문자열이 같다.");
		}
		
		String strVar3 = new String("세종대왕");
		String strVar4 = new String("세종대왕2");
		
		if(strVar3==strVar4) {
			System.out.println("참조가 같다.");
		} else {
			System.out.println("참조가 다름.");
		}
		
		if(strVar3.contentEquals(strVar4)) {
			System.out.println("문자열이 같다.");
		}
		else {
			System.out.println("문자열이 다르다.");
		}
		
		
		
		
	}

}
