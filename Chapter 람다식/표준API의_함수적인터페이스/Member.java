package ǥ��API��_�Լ����������̽�;

// ǥ�� API�� �Լ��� �������̽�
// andThen()�� compose() ����Ʈ �޼ҵ�
// ȸ�� Ŭ����

public class Member {
	private String name;
	private String id;
	private Address address;
	
	public Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public String getName() { return name; }
	
	public String getId() { return id; }
	public Address getAddress() { return address; }
}
