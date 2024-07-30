import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

       // employees is an array of Employee objects
        // Non primitive datatype.
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            // Create a new Employee object and store it in the array
            employees[i] = new Employee(name, id, salary);
        }
        System.out.println("\nEmployees with salary greater than 18,000:");
        for (int i = 0; i < n; i++) {
        	//You are accessing the ith Employee object in the employees array.
            if (employees[i].salary >= 18000) {
                employees[i].display();
            }
        }

        
    }
}

