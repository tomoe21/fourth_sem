class car
{
	private String model;
	private String color;
	private double speed;
	
	public car(String model , String color, double speed)
	{
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel()
	{
		this.model = model;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor()
	{
		this.color = color;
	}
	public double getSpeed()
	{
		return speed;
	}
	public void setSpeed()
	{
		this.speed = speed;
	}
	
	public boolean isFaster(car other)
	{
		return this.speed>other.speed;
	}
}
public class q3 {

	public static void main(String[] args) {
		car c1 = new car("Toyota" , "white" , 120.23);
		car c2 = new car("honda" , "black" , 150.67);
		if(c1.isFaster(c2))
		{
			System.out.print(c1.getModel()+ "is faster than " + c2.getModel());
			System.out.print("Print details:");
		    System.out.println(c1);
		}
		else
		{
			System.out.println(c2.getModel() + " is faster than" + c1.getModel());
			System.out.println("p4rin deails");
			System.out.println(c2);
		}
			
			

	}

}
