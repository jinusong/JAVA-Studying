package 검색기능을_강화시킨_컬렉션;

import java.util.Iterator;
import java.util.TreeSet;


// 검색기능을 강화시킨 컬렉션
// Comparable과 Comparator
// 사용자 정의 객체를 나이 순으로 정렬하기

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));	//저장될 때 나이 순으로 정렬됨
		treeSet.add(new Person("박지뭔", 31));
		
		Iterator<Person> iterator = treeSet.iterator();	//왼쪽 마지막 노드에서 오르쪽 마지막 노드까지 반복해서 가져오기(오름차순)
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ": " + person.age);
		}
	}
}
