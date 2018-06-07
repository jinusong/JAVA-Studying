package Objects클래스;

//객체 비교(compare(T a, T b, Comparator<T>c))
//학생 번호 비교자

import java.util.Comparator;

import Objects클래스.CompareExample.Student;
 
public class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student a, Student b) {
		if(a.sno<b.sno) return -1;
		else if(a.sno == b.sno) return 0;	//간단하게 다음 코드로 대체할 수 있다. return Integer.compare(a.sno, b.sno);
		else return 1;
	}
}
