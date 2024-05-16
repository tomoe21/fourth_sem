import java.util.concurrent.ThreadLocalRandom;

class NumberData {
	private int intVal;
	private double doubleVal;
	
	public void initialize(int intVal, double doubleVal) {
		this.intVal=intVal;
		this.doubleVal=doubleVal;
		}

	int getIntVal() {
		return intVal;
	}
	
	void setIntVal(int intVal) {
		this.intVal=intVal;
	}
	
	double getDoubleVal() {
		return doubleVal;
	}
	
	void setDoubleVal(double doubleVal) {
		this.doubleVal=doubleVal;
	}
}
public class q5 {

	
	static int sum(int a,int b) {
		return a+b;
	}
	
	static int diff(int a,int b) {
		int c=a*3;
		return sum(c,b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime runtime = Runtime.getRuntime();
		long totalMemory = runtime.totalMemory();
		
		NumberData obj1 = new NumberData();
		NumberData obj2 = new NumberData();
		
		obj1.initialize(ThreadLocalRandom.current().nextInt(100), ThreadLocalRandom.current().nextDouble());
		obj2.initialize(ThreadLocalRandom.current().nextInt(100), ThreadLocalRandom.current().nextDouble());
		
		obj1 = null;
		obj2 = null;
		
		runtime.gc();
		
		long usedMemory = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("Total memory allocated: " + totalMemory + " bytes");
		System.out.println("Memory occupied by objects: " + usedMemory + " bytes");
		
	}

}
