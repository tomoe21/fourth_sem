public class Car {
    private String make,model;

    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }

    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make=make;
    }
    

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model= model;
    }
}
public class CarTester {
    public static void main(String[] args) {
        
        Car myCar1=new Car("4 Wheels", "Nano");
        Car myCar2=new Car(null,null);

        System.out.println("Car make: "+myCar1.getMake()+","+"Car model: "+myCar1.getModel());
        System.out.println("Car make: "+myCar2.getMake()+","+"Car model: "+myCar2.getModel());

        myCar2.setMake("5 Wheels");
        myCar2.setModel("Maruti");


        System.out.println("Car make: "+myCar2.getMake()+","+"Car model: "+myCar2.getModel());
    }
}
