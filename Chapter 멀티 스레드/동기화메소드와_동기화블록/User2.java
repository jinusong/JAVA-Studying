package ����ȭ�޼ҵ��_����ȭ���;

// ����ȭ�޼ҵ�� ����ȭ ���
// ������ü�� ����� ���� ������ ��
// User2 ������

public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");	//������ �̸��� User2�� ����
		this.calculator = calculator;	//���� ��ü�� Calculator�� �ʵ忡 ����
	}
	
	public void run() {
		calculator.setMemory(50);	//���� ��ü�� Calculator�� �޸𸮿� 50�� ����
	}
}
