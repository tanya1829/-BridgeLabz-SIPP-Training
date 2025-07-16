package day4;

public class Q2 {
    public static void main(String[] args) {
        // your code here public static void main(String[] args) {
        double t = 10; // example temperature
        double v = 15; // example wind speed
        double chill = calculateWindChill(t, v);
        System.out.println("Wind chill: " + chill);
    }

    public static double calculateWindChill(double t, double v) {
        return 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
    }

}
