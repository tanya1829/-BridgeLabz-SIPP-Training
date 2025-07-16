package day4;

public class Q7 {
    public static void main(String[] args){

        handleNullPointer();
    }
   @java.lang.SuppressWarnings("null")
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    static void handleNullPointer() {
        try {
            
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}

    

