package �����������;

import ��������ǿ���_���ܹ߻�.Account;
import ��������ǿ���_���ܹ߻�.BalanceInsufficientException;

//����� ���� ���� �߻���Ű��
public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: "+account.getBalance());
		//����ϱ�
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {	//���� �޽��� ���
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();					//���� ���� �� ���
			e.printStackTrace();
		}
	}
}