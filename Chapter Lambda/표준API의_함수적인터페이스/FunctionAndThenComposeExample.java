package 표준API의_함수적인터페이스;

import java.util.function.Function;

// 표준 API의 함수적 인터페이스
// andThen()과 compose() 디폴트 메소드
// Function의 순차적 연결

public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(
			new Member("홍길동", "hong", new Address("한국", "서울"))
		);
		System.out.println("거주 도시: " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
			new Member("홍길동", "hong", new Address("한국", "서울"))
		);
		System.out.println("거주 도시: " + city);
	}
}
