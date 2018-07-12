package ǥ��API��_�Լ����������̽�;

// ǥ�� API�� �Լ��� �������̽�
// Function �Լ��� �������̽�

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.Arrays;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
		new Student("ȫ�浿", 90, 96),
		new Student("�ſ��", 95, 93)
	);
	
	public static void printString( Function<Student, String> function) {
		for(Student student : list) { //list�� ����� �׸� ����ŭ ����
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<Student> function) {
		for(Student student : list) { // list�� ����� �׸� ����ŭ ����
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		printString( t -> t.getName());
		
		System.out.println("[���� ����]");
		printInt( t -> t.getEnglishScore());
		
		System.out.println("[���� ����]");
		printInt( t -> t.getMathScore() );
	}
}
