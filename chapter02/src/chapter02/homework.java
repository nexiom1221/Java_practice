package chapter02;

public class homework {
public static void main(String[] args) {
	int i,j;
	 
	for( i = 4 ; i < 10; i +=2 ){ 
		for( j = 0; j <= (10 - i); j++ ){System.out.print(" ");} 
		for( j = 0; j <= i * 2; j++ ){System.out.print("*");} 
		for( j = 0; j <= (10 - i) * 2; j++ ){System.out.print(" ");} 
		for( j = 0; j <= i * 2; j++ ){System.out.print("*");} 
		System.out.print("\n"); 
	} 
	for( i = 20; i >= 0; i -= 2 ){ 
		for( j = 0;  j <= 20 - i; j++ ){ System.out.print(" ");}   
		for( j = 0; j <= i * 2; j++ ){System.out.print("*");}
		System.out.print("\n");
	 
 
}


}
}
