package 인터페이스2;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();//InterfaceA변수는 met                                                                                                                                                                                                                                                                                                                                                                                                                                                         hodA만 호출가능
		
		InterfaceB ib = impl;
		ib.methodB();		//InterfaceB변수는 methodB()만 호출가능
		System.out.println();
		
		InterfaceC ic = impl;
		ia.methodA();
		ib.methodB();	//InterfaceC변수는 methodA(), methodB(), methodC() 모두 호출 가능
		ic.methodC();
	}
}
