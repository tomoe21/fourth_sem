public class Laptop {
    private String model;
    private double price;

    public Laptop(String model,double price){
        this.model=model;
        this.price=price;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    @Override
    public String toString(){
        return ("Laptop model: "+this.model+" costs "+this.price+" Rs.");
    }
}

public class q4 {
    public static void main(String[] args) {
        Laptop laptop1=new Laptop("HP", 23000.5);
        Laptop laptop2=new Laptop("Dell", 100020.7);

        System.out.println(laptop1.toString());
        System.out.println(laptop2.toString());
    }
}
