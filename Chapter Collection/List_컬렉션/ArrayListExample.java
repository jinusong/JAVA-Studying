package List_컬렉션;

import java.util.ArrayList;
import java.util.List;

// List컬렉션
// ArrayList
// String 객체를 저장하는 ArrayList

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수: " + size);;
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
			
		}
	}
}
