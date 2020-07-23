package chapter03;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        boolean play = true;
	        int money = 0;
	        Exam08 Bank = new Exam08("totalmoney",0);
	    
	    while(play) {
	        System.out.println("");
	        System.out.println("---------------------------");
	        System.out.println("1.예금 ㅣ 2.출금 ㅣ 3.잔고 ㅣ 4.종료");
	        System.out.println("---------------------------");
	        System.out.print("선택하기 :");
	        
	        int choice = sc.nextInt();
	        
	        
	            switch(choice) {
	            case 1:
	                System.out.print("예금액 :");
	                money=sc.nextInt();
	                Bank.totalIn(money);
	                break;
	                
	            case 2:
	                System.out.print("출금액 :");
	                money=sc.nextInt();
	                Bank.totalOut(money);
	                break;
	            
	            case 3:
	                System.out.print("잔고액 :");
	                Bank.showTotal();
	                break;
	                
	            case 4:
	                System.out.println("프로그램 종료");
	                break;
	                
	            default :
	                System.out.println("다시 입력해주세요");
	                continue;
	                
	            }
	        }
	        sc.close();
	    }
	}
	
	
