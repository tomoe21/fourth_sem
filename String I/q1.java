public class q1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println("Memory addresses using String literals:");
        System.out.println("s1 address: " + System.identityHashCode(s1));
        System.out.println("s2 address: " + System.identityHashCode(s2));

        System.out.println("\nMemory addresses using new keyword:");
        System.out.println("s3 address: " + System.identityHashCode(s3));

        System.out.println("\nString comparison using equals() method:");
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        System.out.println("\nString comparison using == operator:");
        System.out.println("s1 == s2: " + (s1 == s2)); 
        System.out.println("s1 == s3: " + (s1 == s3)); 
    }
}
