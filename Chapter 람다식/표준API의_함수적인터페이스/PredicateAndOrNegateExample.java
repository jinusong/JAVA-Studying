package 표준API의_함수적인터페이스;

import java.util.function.IntPredicate;

// 표준 API의 함수적 인터페이스
// and(), or(), negate() 디폴트 메소드와 isEqual() 정적 메소드
// Predicate 간의 논리 연산

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		//2의 배수 검사
		IntPredicate predicateA = a -> a%2 == 0;
		
		//3의 배수 검사
		IntPredicate predicateB = (a) -> a%3 ==0;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result );
		
		//or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까? ");
		
		//negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? " + result);
	}
}
