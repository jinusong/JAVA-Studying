package �˻������_��ȭ��Ų_�÷���;

import java.util.Iterator;
import java.util.TreeSet;

// �˻������ ��ȭ��Ų �÷���
// Comparable�� Comparator
// �������� �����ڸ� ����ϴ� TreeSet

public class ComparatorExample {
	public static void main(String[] args) {
		/*
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		//Fruit�� Comparable�� �������� �ʾұ� ������ ���� �߻�
		treeSet.add(new Fruit("����", 3000));
		treeSet.add(new Fruit("����", 10000));	//Fruit�� Comparable�� �������� �ʾұ� ������ ���� �߻�
		treeSet.add(new Fruit("����", 6000));
		 */
	
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		treeSet.add(new Fruit("����", 3000));
		treeSet.add(new Fruit("����", 10000));	//����� �� ������ �������� �������� ���ĵ�
		treeSet.add(new Fruit("����", 6000));
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ": " + fruit.price);
		}
	}
}
