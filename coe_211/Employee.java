package coe_211;


import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        firstName = scan.nextLine();
        
        System.out.println("Enter the last name: ");
        lastName = scan.nextLine();
        
        System.out.println("Enter the age: ");
        age = scan.nextInt();
        
        System.out.println("Enter the salary: ");
        salary = scan.nextDouble();

    }

    public String toString() {
        String str = ("Employee Information: " + firstName + " " + lastName + " " + age + " " + salary);
        return str;
    }
}