package ObjectsŬ����;

//��ü ��(compare(T a, T b, Comparator<T>c))
//�л� ��ȣ ����

import java.util.Comparator;

import ObjectsŬ����.CompareExample.Student;
 
public class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student a, Student b) {
		if(a.sno<b.sno) return -1;
		else if(a.sno == b.sno) return 0;	//�����ϰ� ���� �ڵ�� ��ü�� �� �ִ�. return Integer.compare(a.sno, b.sno);
		else return 1;
	}
}
