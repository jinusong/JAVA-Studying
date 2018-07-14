package ǥ��API��_�Լ����������̽�;

import java.util.function.BinaryOperator;

// ǥ��API�� �Լ����������̽�
// minBy(),maxBy() ���� �޼ҵ�

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 10000));
		System.out.println(fruit.name);
		
		binaryOperator = BinaryOperator.maxBy( (f1,f2)->Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 10000));
		System.out.println(fruit.name);
	}
}