package �˻������_��ȭ��Ų_�÷���;

import java.util.NavigableSet;
import java.util.TreeSet;

// �˻������ ��ȭ��Ų �÷���
// TreeSet
// ���� �ܾ �����ϰ�, ���� �˻��غ���

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("[c~f ������ �ܾ� �˻�]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);	//�˻� �ܾ�� c<=���� <=f�̴�.
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}
}
