//package com.java.generics;
//
//import java.util.ArrayList;
//
//class Fruit { public String toString() { return "Fruit";}}
//class Apple extends Fruit { public String toString() {return "Apple";}}
//class Grape extends Fruit { public String toString() {return "Grape";}}
//class Toy { public String toString() { return "Toy";}}
//
//public class FruitBoxEx1 {
//	public static void main(String[] args) {
//		Box<Fruit> fruitBox = new Box<Fruit>();
//		Box<Apple> appleBox = new Box<Apple>();
//		Box<Toy> toyBox = new Box<Toy>();
//		
//		fruitBox.add(new Fruit());
//		fruitBox.add(new Apple()); //OK. void add(Fruit item)
//		
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
////		appleBox.add(new Toy()); //에러 Box<Apple>에는 Apple만 담을 수 있음
//		
//		toyBox.add(new Toy());
////		toyBox.add(new Apple()); //에러 Box<Toy>에는 Apple을 담을 수 없음
//		
//		System.out.println(fruitBox);
//		System.out.println(appleBox);
//		System.out.println(toyBox);
//	} //main
//
//}
//
//class Box<T> {
//	ArrayList<T> list = new ArrayList<T>();
//	void add(T item) { list.add(item); }
//	T get (int i) { return list.get(i); }
//	int size() { return list.size(); }
//	public String toString() { return list.toString(); }
//	
//}







// FruitEx2에 선언된 내용들과 같은 class들이라 이미 선언되었기 때문에 실행이 불가능함.
// 따라서 FruitEx1을 주석처리 하여 Ex2에서 선언되도록 해줌.
