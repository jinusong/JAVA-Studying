package Ÿ��Ÿ�԰�_�Լ����������̽�;


// �������̽� ���� = ���ٽ�;

// Ÿ�� Ÿ�԰� �Լ��� �������̽�
// �Լ��� �������̽�(@Functionallnterface)
// �Լ��� �������̽�

/*
@FunctionalInterface
public interface MyFunctionalInterface {
	public void method();
	//public void otherMethod();	//������ ����
}
*/

/*
@FunctionalInterface
public interface MyFunctionalInterface {
	public void method(int x);
}
*/

// ���� ���� �ִ� ���ٽ�
// �Լ��� �������̽�

@FunctionalInterface
public interface MyFunctionalInterface {
	public int method(int x, int y);
}