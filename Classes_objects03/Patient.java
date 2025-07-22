package Classes_objects03;

 class Patient {
    
private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private String name;
    private int age;
    private String ailment;
    private final String patientID;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Rahul", 30, "Fever", "PAT001");
        Patient p2 = new Patient("Anita", 25, "Cold", "PAT002");
        p1.displayDetails();
        p2.displayDetails();
        System.out.println("Total Patients: " + getTotalPatients());
    }
} 
