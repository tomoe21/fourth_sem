package generics2;
import java.util.*;

class Car implements Comparable<Car> {
    private int modelNo;
    private String name;
    private int stock;

    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    public int getModelNo() {
        return modelNo;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.getStock());
    }

    public String toString() {
        return modelNo + " " + name + " " + stock;
    }
}

public class q3 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car(2013, "Creta", 10));
        cars.add(new Car(2020, "MG", 13));
        cars.add(new Car(2018, "Kia", 20));
        Collections.sort(cars);

        System.out.println("List of sorted Car objects by stock:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

