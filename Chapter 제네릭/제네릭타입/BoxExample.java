package ���׸�Ÿ��;

/*
//���׸�Ÿ��(class<T>,interface<T>)
//�����׸� Ÿ�� �̿�

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");					// String -> Object (�ڵ� Ÿ�� ��ȯ)
		String name = (String) box.get();	// Object -> String (���� Ÿ�� ��ȯ)
		
		box.set(new Apple());				// Apple -> Object (�ڵ� Ÿ�� ��ȯ)
		Apple apple = (Apple) box.get();	// Object -> Apple (���� Ÿ�� ��ȯ)
	}
}
*/ 

//���׸�Ÿ��(class<T>,interface<T>)
//���׸� Ÿ�� �̿�

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
	}
}