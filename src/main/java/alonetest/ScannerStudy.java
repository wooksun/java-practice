package alonetest;

import java.util.Scanner;

public class ScannerStudy {

	public static void main(String[] args) {
		
//		사용자로부터 세 과목의 점수를 입력받아, 과목별 점수를 출력하고, 세과목의 평균점수를 구하는 식을 쓰시오.
		System.out.println("사용자의 과목별 점수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("국어: ");
		int kuk = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int mat = sc.nextInt();
		
		System.out.println(name+" 님의 점수는 국어:"+kuk+"점, 영어:"+eng+"점, 수학:"+mat+"점 입니다.");
		int total = kuk+eng+mat;
		
		System.out.println(name+" 님의 세 과목 평균점수는 " + (total/3) + "점 입니다.");
	}

}
