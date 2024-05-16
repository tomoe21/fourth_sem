package generics2;
import java.util.*;

class User {
    private String name;
    private int age;
 
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class ArrayListUser {
    private ArrayList<User> users;

   
    public ArrayListUser() {
        users = new ArrayList<>();
    }
  
    public void addUser(User user) {
        users.add(user);
    }
 
    public void printUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
 
    public void sortUsersByAge() {
        Collections.sort(users, new Comparator<User>() {
            public int compare(User u1, User u2) {
                return Integer.compare(u1.getAge(), u2.getAge());
            }
        });
    }

    public static void main(String[] args) {
        ArrayListUser arrayListUser = new ArrayListUser();
  
        arrayListUser.addUser(new User("Seno", 20));
        arrayListUser.addUser(new User("Anshuika", 22));
 
        System.out.println("Users before sorting:");
        arrayListUser.printUsers();
 
        arrayListUser.sortUsersByAge();
 
        System.out.println("\nUsers after sorting by age:");
        arrayListUser.printUsers();
    }
}
 