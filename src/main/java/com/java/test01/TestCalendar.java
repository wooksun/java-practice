package com.java.test01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class TestCalendar {

//	public static void main(String[] args) {
//		
//		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
//		
//		Calendar date1 = Calendar.getInstance();
//		Calendar date2 = Calendar.getInstance();
//		
//		date1.set(2015, 7, 15);
//		System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
//		System.out.println("오늘(date2)은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
//		
//		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
//		System.out.println("그 날(date1)부터 지금(date2)까지 " + difference + "초가 지났습니다.");
//		System.out.println("일(day)로 계산하면 " + difference/(24*60*60) + "일입니다.");
//		
//	}
//	
//	public static String toString (Calendar date) {
//		return date.get(Calendar.YEAR) +"년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일 ";
//	}

//	----------------------------------------------------------------------------------------------------------
//	public static void main(String[] args) {
//		if(args.length !=2) {
//			System.out.println("Usage : java TestCalendar 2023 2");
//			return;
//		}
//		
//		int year = Integer.parseInt(args[0]);
//		int month = Integer.parseInt(args[1]);
//		int START_DAY_OF_WEEK = 0;
//		int END_DAY = 0;
//		
//		Calendar sDay = Calendar.getInstance();
//		Calendar eDay = Calendar.getInstance();
//		
//		sDay.set(year, month-1, 1);
//		eDay.set(year,  month, 1);
//
//		eDay.add(Calendar.DATE, -1);
//		
//		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
//		
//		END_DAY = eDay.get(Calendar.DATE);
//		
//		System.out.println("    " + args[0] + "년 " + args[1] + "월");
//		System.out.println(" SU MO TU WE TH FR SA");
//		
//		for(int i=1; i < START_DAY_OF_WEEK; i++) {
//			System.out.print("  ");
//		}
//		
//		for(int i=1, n=START_DAY_OF_WEEK ; i <= END_DAY; i++, n++) {
//			System.out.print((i<10)? "  " +i : " "+i );
//			if(n%7==0) System.out.println();
//		}
//	}
	
//	----------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
//		LocalDate date1 = LocalDate.of(2014, 1, 1);
//		LocalDate date2 = LocalDate.of(2015, 12, 31);
//		
//		Period pe = Period.between(date1, date2);
//		System.out.println(pe);
		
//		------------------------------------------------------------------------------------------------------
		
//		LocalTime time1 = LocalTime.of(00,00,00);
//		LocalTime time2 = LocalTime.of(12,34,56);
//		
//		Duration du = Duration.between(time1, time2);
//		System.out.println(du);
		
//		------------------------------------------------------------------------------------------------------

		
//		ZonedDateTime zdateTime = ZonedDateTime.now();
//		
//		String[] patternArr = {
//				"yyyy-MM-dd HH:mm:ss",
//				"''yy년 MMM dd일 E요일",
//				"yyyy-MM-dd HH:mm:ss.SSS Z VV",
//				"yyyy-MM-dd hh:mm:ss a",
//				"오늘은 올 해의 D번째 날입니다.",
//				"오늘은 이 달의 d번째 날입니다.",
//				"오늘은 올 해의 w번째 주입니다.",
//				"오늘은 이 달의 W번째 주입니다.",
//				"오늘은 이 달의 W번째 E요일 입니다."
//		};
//		
//		for(String p : patternArr) {
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(p);
//			System.out.println(zdateTime.format(formatter));
//		}
//		------------------------------------------------------------------------------------------------------
		
		

		
	}	
}
