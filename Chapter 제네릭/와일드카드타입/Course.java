package ���ϵ�ī��Ÿ��;

//���ϵ�ī�� Ÿ��(<?>, <? extends ...>, <? super ...>)
//���׸� Ÿ��

public class Course<T>{
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);	//Ÿ�� �Ķ���ͷ� �迭�� �����Ϸ��� new T[] ���·� �迭�� 
													//������ �� ���� (T[]) (new Object[n])���� �����ؾ��Ѵ�.
	}
	
	public String getName() { return name; }
	public T[] getStudents() { return students; }
	public void add(T t) {
		for(int i = 0; i<students.length; i++) {
			if(students[i] == null) {				//�迭�� ����ִ� �κ��� ã�Ƽ� �������� �߰��ϴ� �޼ҵ�
				students[i] = t;
				break;
			}
		}
	}
}
