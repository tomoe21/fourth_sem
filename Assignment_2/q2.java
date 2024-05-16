class book<T>
{
	private int bookId;
	private String name;
	private  T price;
	
	public book(int bookId , String name, T price)
	{
		this.bookId = bookId;
		this.name = name;
		this.price = price;
	}
	public int getBookId()
	{
		return bookId;
	}
	public void setBookId()
	{
		this.bookId = bookId;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name = name;
	}
	public T getPrice()
	{
		return price;
	}
	public void setPrice()
	{
		this.price = price;
	}
	
	public String toString()
	{
		return "Book Id: " + bookId + "Name: " + name + "Price $: " + price;
	}
	
	//public boolean equals(Object obj)
	{
		//if(this==obj) return true;
		//if(obj == null|| getClass()!= obj.getClass())return false;
		//return price.equals(book.price);
	}//
	public boolean equals(book other)
	{
		return this.price == other.price;
	}
}
public class q2 {

	public static void main(String[] args) {
		book <Double> b1 = new book<>(101, "Jp" , 29.99);
		book<Integer> b2 = new book<>(276, "Ds" , 29);
		if(b1.equals(b2))
		{
			System.out.println("Both have same price");
		}
		else
		{
			System.out.println("Prices are different");
		}
	}

}
