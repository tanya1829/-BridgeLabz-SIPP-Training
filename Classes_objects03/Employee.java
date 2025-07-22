package Classes_objects03;

 class Employee {
    private static String companyName = "Tech Solutions";
    private static int totalEmployees = 0;
    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Sam", 101, "Developer");
        Employee e2 = new Employee("Lily", 102, "Manager");
        e1.displayDetails();
        e2.displayDetails();
        displayTotalEmployees();
    }
} 
    

