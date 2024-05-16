class Animal {
    String name;
    String color;
    String type;
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    public int hashCode() {
        return System.identityHashCode(this);
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Dog", "Brown", "pet");
        Animal animal2 = new Animal("Tiger", "Orange", "wild");

        
        System.out.println(animal1);
        System.out.println("HashCode: " + animal1.hashCode());

        System.out.println(animal2);
        System.out.println("HashCode: " + animal2.hashCode());

    }
}

