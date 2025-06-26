
public class Student {
    static String universityName = "Global University";
    private static int totalStudents = 0;

    private final String rollNumber;
    private String name;
    private char grade;

    public Student(String name, String rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void display() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll #: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println();
        }
    }
}
