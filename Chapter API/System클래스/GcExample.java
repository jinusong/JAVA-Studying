package SystemŬ����;

//������ ������ ����(gc())
//gc �޼ҵ�
public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);		//�����Ⱑ ��
		emp = null;
		emp = new Employee(2);		//�����Ⱑ ��
		emp = new Employee(3);
		
		System.out.print("emp�� ���������� �����ϴ� �����ȣ: ");
		System.out.println(emp.eno);
		System.gc();				//������ ������ ���� ��û
	}
}

class Employee{
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ������");
	}
	
	public void finalize() {
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ���ŵ�");		//�Ҹ���
	}
} 
