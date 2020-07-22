package chapter02;

public class ForPrintFrom1To10Example {
public static void main(String[] args) {
	
	int i =0;
	int sum = 0;
	
	for(i=1; i<=10; i++) {
		System.out.println(i);
		sum += i;
	}
	
	System.out.println(sum);
}
}
