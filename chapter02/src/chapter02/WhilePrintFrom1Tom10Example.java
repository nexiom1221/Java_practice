package chapter02;

public class WhilePrintFrom1Tom10Example {
public static void main(String[] args) {
	
	
	int i = 0;
	int sum = 0;
	while(i<=100) {
		System.out.println(i);
		sum += i;
		i++;
		
	}
	System.out.println(sum);
}
}
