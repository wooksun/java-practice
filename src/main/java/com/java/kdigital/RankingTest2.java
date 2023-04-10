package com.java.kdigital;

import java.util.Arrays;

public class RankingTest2 {

	public static void main(String[] args) {

		int[] score = { 80, 100, 70, 100, 90 };
		int[] rank = new int[score.length]; 
		
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}

//		선택정렬 알고리즘
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i+1; j < score.length; j++) { //j=i+1 중요. 
//				i번째 점수가 크면 j번째 석차를 증가, j번째 점수가 크면 i번째 석차를 증가.
				if (score[i] > score[j]) { 
					rank[j]++;
				}else if(score[i] < score[j]){
					rank[i]++;
				}
			}//for
		}//for

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%3d점은 %d등 입니다.\n", score[i], rank[i]);
		}

	}

}
