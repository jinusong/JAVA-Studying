package List_�÷���;

import java.util.Arrays;
import java.util.List;

// List�÷���
// ArrayList
// Arrays.asList() �޼ҵ�

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value: list2) {
			System.out.println(value);
		}
	}
}
