class UnreachableObject {
    String name;

    public UnreachableObject(String name) {
        this.name = name;
    }

    public void display() {
        UnreachableObject obj = new UnreachableObject("obj-1");
    }

    public void show() {
        UnreachableObject obj = new UnreachableObject("obj-2");
        obj.display();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " successfully garbage collected.");
    }
}

public class Q1 {
    public static void main(String[] args) {
    	
        UnreachableObject obj = new UnreachableObject("Main Object");
        obj.show();
        
        System.gc();
    }
}
