package 표준API의_함수적인터페이스;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

// 표준 API의 함수적 인터페이스
// Consumer 함수적 인터페이스

// Consumer<String> consumer = t -> { t를 소비하는 실행문; }
// BitConsumer<String, String>consumer = (t, u) -> { t와 u를 소비하는 실행문; }
// DoubleConsumer consumer = d -> { d를 소비하는 실행문; }
// ObjIntConsumer<String> consumer = (t, i) -> { t와 i를 소비하는 실행문; }

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8);
	}
}
