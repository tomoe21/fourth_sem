package generics2;

public class q1 
{
	public static void main(String[] args)
	{
		Pair<Integer, Integer> p1 = new Pair(1,2);
	}

}
class Pair<K,V>
{
	private K key;
	private V value;
	Pair(K key , V value)
	{
		this.key = key;
		this.value = value;
	}
	public K getKey()
	{
		return key;
	}
	public V getValue()
	{
		return value;
	}
	public void setKey(K key)
	{
		this.key = key;
	}
	public void setValue(V value)
	{
		this.value = value;
	}
} 
