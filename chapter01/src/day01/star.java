package day01;

public class star {
public static void main(String[] args) {
	
	int gugu = 0;
	int gugu2 = 0;
	
	for(gugu=1; gugu<=5; gugu++) {
		for(gugu2=1; gugu2<=gugu; gugu2++){
			System.out.print(gugu+"*"+gugu2+" ");
		}
		System.out.println();
	}
	
	
	
	System.out.println("\n");
	
	
	int star = 0;
	int line = 0;
	
	for(line=1; line<=5; line++) {
		for(star=1; star<=(2*line)-1; star++) {
			
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("\n");
	
	
	int star2 = 0;
	int line2 = 0;
	
	for(line2 =1; line2<=5; line2++) {
		for(star2=line2; star2<=5; star2++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("\n");
	
	
	for(line2 =1; line2<=5; line2++) {
		for(star2=line2; star2<=5; star2++){
			System.out.print("*");
		}
		for(star2=1; star2<=line2; star2++){
			System.out.print("0");
		}
		System.out.println();
	}
	
	System.out.println("\n");
	
	int gong =0 ;
	
	for(line=1; line<=5; line++) {
		for(gong=line; gong<5; gong++) {
			System.out.print(" ");
		}
			for(star=1; star<=(2*line)-1; star++) {
				System.out.print("*");
			}
			System.out.println();
	}
	for(line=1; line<5; line++) {
		for(gong=1; gong<=line; gong++) {
			System.out.print(" ");
		}
		for(star=(2*line)-1; star<=(5*2)-3; star++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int i=0; i<5; i++) {
		for(int j=0; j<i; j++) {
			System.out.print(" ");
		}
		for(int k=5; k>i; k--) {
			System.out.print("*");
		}
		System.out.println();
	}
		System.out.println();
		
	for(int i=0; i<5; i++) {
		for(int j=5; j>=i; j--) {
			System.out.print(" ");
		}
		for(int k=0; k<=i; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=0; i<5; i++) {
		System.out.print("  ");
		for(int j=4; j>i; j--) {
			System.out.print("*");
		}
		for(int k=5; k<i; k++) {
			System.out.print(" ");
		}
		System.out.println();
	}
	
	
	
}
}



