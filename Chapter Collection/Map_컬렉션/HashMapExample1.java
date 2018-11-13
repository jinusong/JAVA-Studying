package Map_�÷���;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

// Map �÷���
// HashMap 
// �̸��� Ű�� ������ ������ �����ϱ�
 
public class HashMapExample1 {
	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		 
		//��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);	//"ȫ�浿" Ű�� ���� ������ ���� �������� ������ ������ ��ġ
		System.out.println("�� Entry ��: " + map.size());	//����� �� Entry �� ���
		
		//��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));	//�̸�(Ű)���� ����(��)�� �˻�
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();		//Key Set ���
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);		//�ݺ��ؼ� Ű�� ��� ���� Map���� ��
		}
		System.out.println();
		
		//��ü ����
		map.remove("ȫ�浿");		//Ű�� Map.Entry�� ����
		System.out.println("�� Entry ��: " + map.size());
		
		//��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();		//Map.EntrySet ���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();		//�ݺ��ؼ� Map.Entry�� ��� Ű�� ���� ��
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//��ü ��ü ����
		map.clear();	//��� Map.Entry ����
		System.out.println("�� Entry ��: " + map.size());
	}
}
