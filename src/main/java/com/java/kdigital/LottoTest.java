package com.java.kdigital;

import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		
//		추첨기를 만든다. (배열 lotto 1~45)
		int[] lotto = new int[45];
		
//		추첨기에 공을 넣는다.
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if((i+1)% 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n==========섞기 전=========");
			
//		섞는다.
		Random random = new Random();
		for(int i=0; i<1000000; i++) {
			int r = random.nextInt(44)+1; //+1을 하지 않으면, 섞었을 때 51은 섞이지 않고, 고정적으로 끝에 머물게 됨. 
			
			int tmp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = tmp;
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if((i+1)% 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n==========섞은 후=========");
		
//		1등 번호를 출력한다. (앞에 6개 1등번호, 7번째 인덱스 보너스)
		System.out.print("1등 번호: ");
		for(int i=0; i<6; i++) {
			System.out.printf("%2d ", lotto[i]);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.printf("보너스: %2d ", lotto[6]);
		
	}

}
