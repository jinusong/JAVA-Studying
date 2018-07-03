package ���ϵ�ī��Ÿ��;

//���ϵ�ī�� Ÿ��(<?>, <? extends ...>, <? super ...>)
//���ϵ�ī�� Ÿ�� �Ű� ����

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse( Course<?> course ) {	//��� ����
		System.out.println(course.getName() + " ������: " +
				Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent( Course<? extends Student> course ) {	//�л� ����
		System.out.println(course.getName() + " ������: " +
				Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker( Course<? super Worker> course ) {	//����� �Ϲ��� ����
		System.out.println(course.getName() + " ������: " +
				Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<Student>("�л�", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> highStudentCourse = 
				new Course<HighStudent>("����л�����", 5);
		highStudentCourse.add(new HighStudent("����л�"));
	}
}
