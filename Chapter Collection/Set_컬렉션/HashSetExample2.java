package Set_�÷���;

import java.util.HashSet;
import java.util.Set;

// Set �÷���
// HashSet
// Member ��ü�� �ߺ����� �����ϴ� HashSet

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));	//�ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����
		
		System.out.println("�� ��ü��: " + set.size());	//����� ��ü �� ���
	}
}
