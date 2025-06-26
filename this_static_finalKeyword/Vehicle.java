
public class Vehicle {
    static double registrationFee = 500.00;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public void display() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Reg. #: " + registrationNumber);
            System.out.println("Fee: $" + registrationFee);
            System.out.println();
        }
    }
}
