package generics2;
import java.util.*;

class Address {
    private int plotNo;
    private String areaTown;
    private String post;

    public Address(int plotNo, String areaTown, String post) {
        this.plotNo = plotNo;
        this.areaTown = areaTown;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address{" +
                "plotNo=" + plotNo +
                ", areaTown='" + areaTown + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}

public class q7 {
    public static void main(String[] args) { 
        TreeMap<String, Address> treeMap = new TreeMap<>(); 
        treeMap.put("alex volkov", new Address(123, "Main Street", "123456"));
        treeMap.put(" dante russo", new Address(456, "Second Street", "654321")); 

        // Display the TreeMap using an iterator
        Iterator<Map.Entry<String, Address>> iterator = treeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Name: " + entry.getKey());
            System.out.println("Address: " + entry.getValue());
            System.out.println();
        }
    }
} 
