package linearSearch04And05;

public class ReverseAstringUsingStringBuilder {
    public class ReverseString {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Reversed: " + reverse(input));
    }
}

}
