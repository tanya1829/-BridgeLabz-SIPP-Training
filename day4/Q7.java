package day4;

public class Q7 {
    public static void main(String[] args){

        handleNullPointer();
    }

    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    static void handleNullPointer() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}

    

