package ObjectŬ����;

//��ü ���� ��(equals())�޼ҵ�
public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {	//Member Ÿ������ ���� Ÿ�� ��ȯ�ϰ� id�ʵ尪�� �������� �˻��� ��, �����Ѵٸ� true�� ����
				return true;
			}
		}
		return false;		//�Ű����� MemberŸ���� �ƴϰų� id�ʵ尪�� �ٸ���� false�� ����
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	} 
}
