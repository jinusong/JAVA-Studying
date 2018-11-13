package 검색기능을_강화시킨_컬렉션;

import java.util.Iterator;
import java.util.TreeSet;

// 검색기능을 강화시킨 컬렉션
// Comparable과 Comparator
// 내림차순 정렬자를 사용하는 TreeSet

public class ComparatorExample {
	public static void main(String[] args) {
		/*
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		//Fruit이 Comparable을 구현하지 않았기 때문에 예외 발생
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));	//Fruit이 Comparable을 구현하지 않았기 때문에 예외 발생
		treeSet.add(new Fruit("딸기", 6000));
		 */
	
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));	//저장될 때 가격을 기준으로 내림차순 정렬됨
		treeSet.add(new Fruit("딸기", 6000));
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ": " + fruit.price);
		}
	}
}
