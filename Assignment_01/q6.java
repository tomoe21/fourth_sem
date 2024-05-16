public class Book extends LibraryResource {

    private int pageCount;

    public Book(String title,String author,int pageCount){
    	super(title,author);
        this.pageCount=pageCount;
    }

    public int getPageCount(){
        return pageCount;
    }
    public void setPageCount(int pageCount){
        this.pageCount=pageCount;
    }

    @Override
    public void displayDetails(){
        System.out.println("\""+this.getTitle()+"\""+" book contains "+this.getPageCount()+" pages.");
    }
}
public abstract class LibraryResource {

    private String title,author;

    public LibraryResource(String title,String author){
        this.title=title;
        this.author=author;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }

    public abstract void displayDetails();


}
public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book=new Book("The Dictator Debadarshi","Adolf Hitler and Mao Zedong",3000);
		book.displayDetails();
		
		Magazine magazine=new Magazine("Unbeaten Debadarshi","Saddam Hussain","07.03.2024");
		magazine.displayDetails();
		
		DVD dvd=new DVD("Debadarshi:The Ruler","Kim Jung Un","3 months");
		dvd.displayDetails();
		
	}

}
public class Magazine extends LibraryResource {
	
	private String issueDate;
	
	public Magazine(String title,String author,String issueDate) {
		super(title,author);
		this.issueDate=issueDate;
	}
	
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate=issueDate;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("\""+this.getTitle()+"\""+" magazine has been issued on "+this.getIssueDate()+".");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
