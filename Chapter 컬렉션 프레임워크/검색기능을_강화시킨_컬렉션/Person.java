package 검색기능을_강화시킨_컬렉션;

// 검색기능을 강화시킨 컬렉션
// Comparable과 Comparator
// Comparable 구현 클래스

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		if(age<o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}
}
