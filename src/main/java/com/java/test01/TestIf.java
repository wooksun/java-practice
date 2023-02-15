package com.java.test01;

import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
//		if문 예제 1
//		int score = 65;
//		
//		if(score>70) {
//			System.out.println("합격입니다.");
//		}else {
//			System.out.println("불합격입니다.");
//		}
		
//		-------------------------

		
		
//		if문 예제2
//		int input;
//		
//		System.out.print("숫자를 하나 입력하세요.");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); -> 화면을 통해 입력받은 내용을 tmp에 저장
//		input = Integer.parseInt(tmp); -> 입력받은 문자열 (tmp)를 숫자로 변환
//		
//		if(input==0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//		}
//		
//		else {
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//			System.out.printf("입력하신 숫자는 %d입니다.",input);
//		}
//		
		
		
//		-------------------------

//		if-else-if문
//		학점 출력예제
//		int score = 0;
//		char grade = ' ';
//		
//		System.out.print("점수를 입력하세요.");
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		if (score>=90) {
//			grade='A';
//		}else if (score>=80) {
//			grade='B';
//		}else if (score>=70) {
//			grade='C';
//		}else if(score>=60) {
//			grade='D';
//		}else {
//			grade='F';
//		}
//		
//		System.out.println("당신의 학점은" + grade + "입니다.");
//		
//		-------------------------

		
//		if문 중첩
//		int score = 0;
//		char grade = ' ', opt = '0';
//		
//		System.out.print("점수를 입력해주세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
		
//		System.out.printf("당신의 점수는 %d입니다.", score);
		
		//조건식1 if문
//		if (score >=90) { 
//			grade='A';
			//조건식2 if문 , 조건식1과 2를 모두 true일 때 수행되는 문장들
//			if(score>=98) { 
//				opt='+';
//			}else if (score < 94) { 
//				opt = '-';
//			}
//		}else if(score >= 80) {
//			grade='B';
//			if(score >=88) {
//				opt = '+';
//			}else if (score < 84) {
//				opt='-';
//			}
//		} else {
//			grade = 'C';
//		}
//		System.out.printf("당신의 학점은 %c%c입니다. %n", grade, opt);
		
//		-------------------------
		
//		switch문 제약조건
		
//
//		System.out.print("현재 월을 입력하시오.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		int month = scanner.nextInt();
//		
//		switch(month) {
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("현재 계절은 봄입니다.");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("현재 계절은 여름입니다.");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("현재 계절은 가을입니다.");
//			break;
//		default:
//		case 12: case 1: case 2:
//			System.out.println("현재 계절은 겨울입니다.");
//		}
		
		
//		-------------------------

//		위에 switch문을 if문으로 바꾸었을 때
//		
//		System.out.print("현재 월을 입력하시오.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		int month = scanner.nextInt();
//		
//		if (month == 3 || month == 4 || month==5) {
//			System.out.println("현재 계절은 봄입니다.");
//		}else if (month==6 || month==7 || month==8) {
//			System.out.println("현재 계절은 여름입니다.");
//		}else if (month==9 || month==10 || month==11) {
//			System.out.println("현재 계절은 가을입니다.");
//		}else {
//			System.out.println("현재 계절은 겨울입니다.");
//		}
		
//		-------------------------

//		switch문으로 사용자와 컴퓨터간의 가위바위보 게임
//		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		int user = scanner.nextInt();
//		int com = (int) (Math.random() * 3) + 1;
//		
//		System.out.println("당신은" + user + "입니다.");
//		System.out.println("컴퓨터는" + com + "입니다.");
//		
//		switch (user-com) {
//		case 2: case -1:
//			System.out.println("당신이 졌습니다.");
//			break;
//		case 1: case -2:
//			System.out.println("당신이 이겼습니다.");
//			break;
//		case 0:
//			System.out.println("비겼습니다.");
			//마지막이기 때문에 break; 생략 가능하다.
//		}
		
//		-------------------------
		
//		주민등록번호로 성별을 조회하는 예제
//		System.out.print("당신의 주민번호를 입력하세요.(000000-0000000)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String rgeNo = scanner.nextLine();
//		
//		char gender = rgeNo.charAt(7);
//		
//		switch (gender) {
//		case '1': case '3':
//			System.out.println("당신은 남자입니다.");
//			break;
//		case '2': case '4':
//			System.out.println("당신은 여자입니다.");
//			break;
//		default:
//			System.out.println("유효하지 않은 주민등록번호입니다.");
//		}
		
		
		
//		-------------------------
		
//		if문을 switch문화 한 예제
//		char grade = ' ';
//
//		System.out.print("당신의 점수를 입력하세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		int score = scanner.nextInt();
//		
//		switch (score) {
//		case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90:
//			grade = 'A';
//			break;
//		case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
//			grade = 'B';
//			break;
//		case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
//			grade = 'C';
//			break;
//		case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
//			grade = 'D';
//			break;
//			default:
//				grade = 'F';
//		}
//		System.out.println("당신의 학점은" + grade + "입니다.");
		
//		-------------------------

		
//		char grade = ' ';
//		int score = 0;
//		
//		System.out.println("당신의 점수를 입력하세요. (1~100)>");
//
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		score = Integer.parseInt(tmp);
//		
//		switch(score/10) {
//		case 10: case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//		case 6: 
//			grade = 'D';
//			break;
//			default:
//				grade = 'F';
//		}
//		System.out.println("당신의 학점은" + grade + "입니다.");
		
//		-------------------------

//		주민번호 switch 중첩으로 풀어보는 예제
		
//		System.out.println("당신의 주민번호를 입력하시오. (000000-0000000)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String regNo = scanner.nextLine();
//		char gender = regNo.charAt(7);
//		
//		switch (gender) {
//		case '1': case '3':
//			switch(gender) {
//			case '1':
//				System.out.println("2000년 이전에 출생한 남자입니다.");
//				break;
//			case '3':
//				System.out.println("2000년 이후에 출생한 남자입니다.");
//			}break;
//		case '2': case '4':
//			switch(gender) {
//			case '2':
//				System.out.println("2000년 이전에 출생한 여자입니다.");
//				break;
//			case '4':
//				System.out.println("2000년 이후에 출생한 여자입니다.");
//				break;
//			}
//			break;
//			default:
//				System.out.println("유효하지 않은 주민등록번호 입니다.");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
