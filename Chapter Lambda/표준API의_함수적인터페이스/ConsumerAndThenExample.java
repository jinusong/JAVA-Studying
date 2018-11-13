package 표준API의_함수적인터페이스;

import java.util.function.Consumer;

// 표준 API의 함수적 인터페이스
// andThen()과 compose() 디폴트 메소드
// Consumer의 순차적 연결

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId());
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
	}
}
