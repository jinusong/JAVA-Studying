package Map_�÷���;

import java.util.Map;
import java.util.HashMap;

// Map �÷���
// HashMap
// �й��� �̸��� ������ ��� ���� Ű�� �ν�

public class HashMapExample2 {
	public static void main(String[] args){
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 95);	//�й��� �̸��� ������ Student�� Ű�� ����
		
		System.out.println("�� Entry ��: " + map.size());		//����� �� Map.Entry �� ���
	}
}
