package Class클래스;

import Object클래스.Car;

//Class 객체얻기(getClass(), forName())
//getClass와 forName() 예제

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
	}
}
