class NullifiedReference{
	String name;
	
	NullifiedReference(String name){
		this.name=name;
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println(name+" garbage collected successfully.");
	}
}

@SuppressWarnings("unused")
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NullifiedReference obj1=new NullifiedReference("Obj1");
		obj1=null;
		
		System.gc();	
	}
}
