package inheritance;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String dept) {
        super(name, age);
        department = dept;
    }

    void displayRole() {
        System.out.println(name + " is Staff in " + department + " department");
    }
}

public class TestSchool {
    public static void main(String[] args) {
        Teacher t = new Teacher("Ravi", 40, "Math");
        Student s = new Student("Priya", 16, 10);
        Staff st = new Staff("Anil", 35, "Admin");
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

