package ǥ��API��_�Լ����������̽�;

import java.util.function.IntPredicate;

// ǥ�� API�� �Լ��� �������̽�
// and(), or(), negate() ����Ʈ �޼ҵ�� isEqual() ���� �޼ҵ�
// Predicate ���� �� ����

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		//2�� ��� �˻�
		IntPredicate predicateA = a -> a%2 == 0;
		
		//3�� ��� �˻�
		IntPredicate predicateB = (a) -> a%3 ==0;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2�� 3�� ����Դϱ�? " + result );
		
		//or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2 �Ǵ� 3�� ����Դϱ�? ");
		
		//negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9�� Ȧ���Դϱ�? " + result);
	}
}
