package ��������������ó���ڵ�;

//���� catch
public class CatchExceptionKindExample {
	public static void main(String[]args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);	//Integer.pareInt(Stirng s)�� �־��� ���ڿ��� ������ �ٲ���
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		} catch(Exception e) {
			System.out.println("���࿡ ������ �ֽ��ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}
