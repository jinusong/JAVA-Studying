package �˻������_��ȭ��Ų_�÷���;

import java.util.Iterator;
import java.util.TreeSet;


// �˻������ ��ȭ��Ų �÷���
// Comparable�� Comparator
// ����� ���� ��ü�� ���� ������ �����ϱ�

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("���ڹ�", 25));	//����� �� ���� ������ ���ĵ�
		treeSet.add(new Person("������", 31));
		
		Iterator<Person> iterator = treeSet.iterator();	//���� ������ ��忡�� ������ ������ ������ �ݺ��ؼ� ��������(��������)
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ": " + person.age);
		}
	}
}
