package com.java.hashsettest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bingo {

	public static void main(String[] args) {
		Set set = new HashSet();
//		Set set = new LinkedHashSet();
		int[][] board = new int [5][5];
		
		for(int i=0; set.size() < 25; i++) {
			set.add((int)(Math.random()*50)+1+"");
		}
		
		Iterator it = set.iterator();
		
		for(int i=0; i < board.length; i++) {
			for(int j=0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") +  board[i][j]);
			}
			System.out.println();
		}
		
		//next()는 반황값이 Object타입이므로 형변환해서 원래의 타입으로 되돌려 놓아야 한다.
		//random()을 사용했기에 실행결과는 매번 바뀌지만, 같은 숫자가 비슷한 위치에 나온다.
		//->HashSet은 저장된 순서를 보장하지 않고 자체적은 저장방식에 따라 순서가 결정됨.
		//HashSet보다 LinkedJashSet이 더 나은 선택임.
	}

}
