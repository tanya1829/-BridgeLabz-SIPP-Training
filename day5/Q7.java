package day5;

public class Q7 {
    public static void generateException() {
        String text = null;
        System.out.println("Length of null string:");
        System.out.println(text.length()); // Will throw exception
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println("Length (handled):");
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    
    }
    public static void main(String[] args) {
        // generateException(); // Uncomment to crash
        handleException();
    }
}