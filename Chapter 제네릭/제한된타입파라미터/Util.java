package ���ѵ�Ÿ���Ķ����;

//���ѵ� Ÿ�� �Ķ����(<T extends �ֻ���Ÿ��>)
//���׸� �޼ҵ�

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1,  v2);
	}
}