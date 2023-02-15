package com.java.test01;

import java.io.File;

public class TestTryCatch {

//	public static void main(String[] args) {
//		
//		try {
//			Exception e = new Exception("고의로 발생시켰음");
//			throw e;
//		} catch (Exception e){
//			System.out.println("에러 메세지 : " + e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("프로그램이 정상 종료되었음.");
//	}
	
//	---------------------------------------------------------------------
//	
//	public static void main(String[] args) {
//		method1 ();
//	}
//	
//	static void method1( ) {
//		try {
//			throw new Exception();
//		} catch(Exception e) {
//			System.out.println("method1에서 예외처리 되었음.");
//			e.printStackTrace();
//		}
//	}
	
//	---------------------------------------------------------------------

	
//	public static void main(String[] args) {
//		try {
//			method1();
//		} catch(Exception e) {
//			System.out.println("main메서드에서 예외가 처리되었습니다.");
//			e.printStackTrace();
//		}
//	}
//	
//	static void method1()  throws Exception{
//		throw new Exception();
//	}
	
//	---------------------------------------------------------------------

//	public static void main(String[] args) {
//		File f = createFile(args[0]);
//		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
//	}
//	
//	static File createFile(String fileName) {
//		try {
//			if(fileName==null || fileName.equals(""))
//				throw new Exception("파일이름이 유효하지 않습니다.");
//		}catch(Exception e) {
//			fileName = "제목없음.txt";
//		}finally {
//			File f = new File(fileName);
//			createNewFile(f);
//			return f;
//		}
//	}
//	
//	static void createNewFile(File f) {
//		try {
//			f.createNewFile();
//		}catch(Exception e) {
//			
//		}
//	}
	
	
//	---------------------------------------------------------------------

	
//	public static void main(String[] args) {
//		try {
//			File f = createFile(args[0]);
//			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
//		} catch(Exception e) {
//			System.out.println(e.getMessage() + "다시 입력해 주시기 바랍니다.");
//		}
//	}
//	
//	static File crateFile(String fileName) throws Exception {
//		if(fileName==null || fileName.equals(""))
//			throw new Exception("파일이름이 유효하지 않습니다.");
//		File f = new File(fileName);
//		f.createNewFile();
//		return f;
//	}
	
//	---------------------------------------------------------------------

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
