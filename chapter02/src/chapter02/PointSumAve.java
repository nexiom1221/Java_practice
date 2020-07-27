package chapter04;

import java.util.Scanner;

public class PointSumAve {

	public static void main(String[] args) {
		
		Scanner insu = new Scanner(System.in);
		
		System.out.println("사람수를 입력하세요 :");
		int n = insu.nextInt();
		int[] jumsu = new int[n];
		
		System.out.print("점수를 입력하세요: ");
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			System.out.print((i+1) + "번의 점수 : ");
			jumsu[i] =insu.nextInt();
			sum += jumsu[i];
		}

		int max = jumsu[0];
		int min = jumsu[0];
		for(int i=1; i<n; i++) {
			if(jumsu[i] > max) max= jumsu[i];
			if(jumsu[i] < min) min = jumsu[i];
		}
		
		System.out.println(sum);
		System.out.println((double)sum/n);
		System.out.println(max);
		System.out.println(min);
	}

}
