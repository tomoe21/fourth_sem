class ReassigningReference{
	String name;
	
	ReassigningReference(String name){
		this.name=name;
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println(name+" successfully garbage collected.");
	}
}
public class q2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReassigningReference obj1=new ReassigningReference("Obj-1");
		ReassigningReference obj2=new ReassigningReference("Obj-2");
		
		obj2=obj1;

		System.gc();
	}

}
