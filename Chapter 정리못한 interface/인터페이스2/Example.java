package �������̽�2;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();//InterfaceA������ met                                                                                                                                                                                                                                                                                                                                                                                                                                                         hodA�� ȣ�Ⱑ��
		
		InterfaceB ib = impl;
		ib.methodB();		//InterfaceB������ methodB()�� ȣ�Ⱑ��
		System.out.println();
		
		InterfaceC ic = impl;
		ia.methodA();
		ib.methodB();	//InterfaceC������ methodA(), methodB(), methodC() ��� ȣ�� ����
		ic.methodC();
	}
}
