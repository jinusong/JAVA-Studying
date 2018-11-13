package 제네릭메소드;

//제네릭 메소드(<T, R> R method(T t))
//제네릭 타입
public class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public void setKey(K key) { this.key = key; }
	public void setValue(V value) { this.value = value;}
	public K getKey() { return key; }
	public V getValue() { return value; }
}
