package ClassŬ����;

import ObjectŬ����.Car;

//Class ��ü���(getClass(), forName())
//getClass�� forName() ����

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
	}
}
