package alonetest;

import java.util.Scanner;

public class ScannerName {

	public static void main(String[] args) {
		
//		사용자로부터 나이와 이름을 입력받고, 다음연도의 나이를 계산하시오.
		System.out.print("사용자의 나이를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.nextLine();
			
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.println(name + "님의 나이는 " + age + "세 입니다." );
		System.out.println(name + "님의 내년 나이는 " + (age+1) + "세 입니다." );
	}

}
