package ǥ��API��_�Լ����������̽�;

import java.util.function.Function;

// ǥ�� API�� �Լ��� �������̽�
// andThen()�� compose() ����Ʈ �޼ҵ�
// Function�� ������ ����

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
			new Member("ȫ�浿", "hong", new Address("�ѱ�", "����"))
		);
		System.out.println("���� ����: " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
			new Member("ȫ�浿", "hong", new Address("�ѱ�", "����"))
		);
		System.out.println("���� ����: " + city);
	}
}
