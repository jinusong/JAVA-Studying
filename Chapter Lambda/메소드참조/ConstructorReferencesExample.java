package 메소드참조;

import java.util.function.BiFunction;
import java.util.function.Function;

// 메소드참조
// 생성자 참조

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;		//생성자 참조
		Member member1 = function1.apply("angel");	//매개값 1개
		
		BiFunction<String, String, Member> function2 = Member :: new;	//생성자 참조
		Member member2 = function2.apply("신천사", "angel");	//매개값 2개
	}
}
