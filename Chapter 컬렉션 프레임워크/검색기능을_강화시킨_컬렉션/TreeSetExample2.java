package �˻������_��ȭ��Ų_�÷���;

import java.util.NavigableSet;
import java.util.TreeSet;

// �˻������ ��ȭ��Ų �÷���
// TreeSet
// ��ü �����ϱ�

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		for(Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
	}
}
