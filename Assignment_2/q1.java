class student <T>
{
	private String name;
	private int age;
	private T roll;
	
	public student(String name , int age , T roll)
	{
		this.name = name;
		this.age = age;
		this.roll = roll;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge()
	{
		this.age = age;
	}
	public T getRoll()
	{
		return roll;
	}
	public void setRoll()
	{
		this.roll = roll;
	}
	
	public void PrintDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Roll no: " + roll);
	}
}
public class Q1 {

	public static void main(String[] args) 
	{
		student <String> s1 = new student("Neha" , 20 , "101");
		student <Integer> s2 = new student("Sneha" , 20, 101);
		System.out.println("Details of first student: ");
		s1.PrintDetails();
		System.out.println("Details of second student: ");
		s2.PrintDetails();

	}

}
