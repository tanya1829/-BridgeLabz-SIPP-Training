package JavaGenerics.JavaStream;
import java.io.*;
import java.util.*;
class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + ", " + name + ", " + department + ", ₹" + salary;
    }
}
public class Serialization {
    
public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee(1, "Tanya", "IT", 55000),
            new Employee(2, "Amit", "HR", 47000)
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            oos.writeObject(list);
            System.out.println("Employees serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"))) {
            List<Employee> deserialized = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employees:");
            deserialized.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
