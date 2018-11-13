package 검색기능을_강화시킨_컬렉션;

import java.util.NavigableSet;
import java.util.TreeSet;

// 검색기능을 강화시킨 컬렉션
// TreeSet
// 영어 단어를 정렬하고, 범위 검색해보기

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
		
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);	//검색 단어는 c<=에서 <=f이다.
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}
}
