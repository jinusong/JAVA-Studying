package 표준API의_함수적인터페이스;

// 표준 API의 함수적 인터페이스
// Function 함수적 인터페이스

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.Arrays;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93)
	);
	
	public static void printString( Function<Student, String> function) {
		for(Student student : list) { //list에 저장된 항목 수만큼 루핑
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<Student> function) {
		for(Student student : list) { // list에 저장된 항목 수만큼 루핑
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString( t -> t.getName());
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishScore());
		
		System.out.println("[수학 점수]");
		printInt( t -> t.getMathScore() );
	}
}
