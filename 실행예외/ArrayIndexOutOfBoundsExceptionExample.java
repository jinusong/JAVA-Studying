package ���࿹��;

/*public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: "+ data1);
		System.out.println("args[1]: "+ data2);
	}
}*/

public class ArrayIndexOutOfBoundsExceptionExample{
	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		} else {
			System.out.println("[���� ���]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("��1 ��2");
		}
	}
}
