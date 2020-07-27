package chapter04;


import java.util.Scanner;

public class FingerFlashing {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
	
		
		String handstr = "", userStr="";
		
		int win=0, lose=0, draw=0 , fail=0;
		
		System.out.println("코인을 넣으세요(최대 10번)");
		
		int coin = scan.nextInt();
		
		if(coin > 10) {
			System.out.println("더이상 사용할 수 없습니다.");
			return;
		}
		
		
		System.out.println("게임시작");
		System.out.printf("가위 :1  바위:2  보:3");
		System.out.println();
		
		
		
		for(int i=0; i<coin; i++) {
		
		int hand = (int)(Math.random()*3) + 1;
		int myHand = scan.nextInt();
		
		
		
		switch(hand) {
		case 1:
			userStr = "가위";
			break;
		case 2:
			userStr= "바위";
			break;
		case 3:
			userStr = "보자기";
			break;
		}
		
		switch(myHand) {
		case 1:
			handstr = "가위";
			break;
		case 2:
			handstr = "바위";
			break;
		case 3:
			handstr = "보자기";
			break;
		}
		
		System.out.println("컴퓨터가 낸 것: " + hand);
		if(myHand == hand) {
			draw++;
			System.out.println("비겼습니다");
		} else if((myHand ==1) && (hand==2) || (myHand == 2)&& (hand==3) || (myHand==3)&& (hand==1)) {
			lose++;
			System.out.println("당신이 졌습니다.");
		} else if((myHand==1)&& (hand==3)|| (myHand==2)&& (hand==1) || (myHand==3)&& (hand==23)) {
			win++;
			System.out.println("당신이 이겼습니다.");
		} else {
            fail++;
            System.out.println("값을 잘못 입력 하였습니다.");    
        }
		
		}
		
		float odds = ((float)win/(float)(coin))*100;
		
		System.out.println("결과: 게임횟수 : "+coin);
		System.out.println("[전적] win:"+win+"번, lose:"+lose+"번, draw:"+draw+"번, 무효:"+fail+"번");
        System.out.printf("[승률] %.2f%% \n",odds);
		System.out.println("종료");
		
		
		
		scan.close();
		
		
	}
}
