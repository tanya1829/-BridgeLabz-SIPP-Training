// Create TravelComputation Class to compute the Distance and Travel Time
class TravelComputation {
    public static void main(String[] args) {

        // Create a variable name to indicate the person traveling
        String name = "Eric";

        // Create a variable fromCity, viaCity and toCity to indicate the cities
        String fromCity = "Chennai";
        String viaCity = "Vellore";
        String toCity = "Bangalore";

        // Distance and time from fromCity to viaCity
        double distanceFromToVia = 156.6;
        int timeFromToVia = 4 * 60 + 4;

        // Distance and time from viaCity to toCity
        double distanceViaToFinalCity = 211.8;
        int timeViaToFinalCity = 4 * 60 + 25;

        // Compute total distance and time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("The Total Distance travelled by " + name + " from " +
                           fromCity + " to " + toCity + " via " + viaCity + " is " +
                           totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
    }
}