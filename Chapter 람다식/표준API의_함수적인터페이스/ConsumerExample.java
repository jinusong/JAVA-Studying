package ǥ��API��_�Լ����������̽�;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

// ǥ�� API�� �Լ��� �������̽�
// Consumer �Լ��� �������̽�

// Consumer<String> consumer = t -> { t�� �Һ��ϴ� ���๮; }
// BitConsumer<String, String>consumer = (t, u) -> { t�� u�� �Һ��ϴ� ���๮; }
// DoubleConsumer consumer = d -> { d�� �Һ��ϴ� ���๮; }
// ObjIntConsumer<String> consumer = (t, i) -> { t�� i�� �Һ��ϴ� ���๮; }

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
