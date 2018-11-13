package ���׸�Ÿ���ǻ�Ӱ�����;

//���׸� Ÿ���� ��Ӱ� ����
//���׸� ���� Ŭ����

public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]); 	//Ÿ�� �Ķ���ͷ� �迭�� �����Ϸ��� new T[n]���·� ������ �� ����
													//(T[])(new Object[n])���� �����ؾ� �Ѵ�.
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}

	@Override
	public T get(int index) {
		return array[index];
	}
}
