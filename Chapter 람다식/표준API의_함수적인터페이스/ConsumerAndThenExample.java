package ǥ��API��_�Լ����������̽�;

import java.util.function.Consumer;

// ǥ�� API�� �Լ��� �������̽�
// andThen()�� compose() ����Ʈ �޼ҵ�
// Consumer�� ������ ����

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId());
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("ȫ�浿", "hong", null));
	}
}
