package day2;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        String fromCity = input.next();
        String viaCity = input.next();
        String toCity = input.next();
        double fromToVia = input.nextDouble();
        double viaToFinalCity = input.nextDouble();
        int timeFromToVia = input.nextInt();
        int timeViaToFinalCity = input.nextInt();

        double totalDistance = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity +
                           " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
        input.close();
    }
    
}
