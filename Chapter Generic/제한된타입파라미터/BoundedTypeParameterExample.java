package ���ѵ�Ÿ���Ķ����;

//���ѵ� Ÿ�� �Ķ����(<T extends �ֻ���Ÿ��>)
//���׸� �޼ҵ� ȣ��
public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b");   (x) String�� NumberŸ���� �ƴ�
		
		int result1 = Util.compare(10, 20); //int -> integer(�ڵ� Boxing)
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3); //double -> Double(�ڵ� Boxing)
		System.out.println(result2);
	}
}
