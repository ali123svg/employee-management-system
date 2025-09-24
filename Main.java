package employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        employee[] employees = new employee[100];
        int count = 0;

        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. List All Employees");
            System.out.println("4. Find Employee with Highest Salary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (count >= employees.length) {
                        System.out.println("Employee database is full!");
                        break;
                    }
                    System.out.print("Enter name: ");
                    String mName = scanner.nextLine();
                    System.out.print("Enter department: ");
                    String mDepartment = scanner.nextLine();
                    System.out.print("Enter base salary: ");
                    double mSalary = scanner.nextDouble();
                    System.out.print("Enter bonus: ");
                    double mBonus = scanner.nextDouble();
                    employees[count++] = new Manager(mName, mDepartment, mSalary, mBonus);
                    System.out.println("Manager added successfully!");
                    break;
                    
                case 2:
                    if (count >= employees.length) {
                        System.out.println("Employee database is full!");
                        break;
                    }
                    System.out.print("Enter name: ");
                    String dName = scanner.nextLine();
                    System.out.print("Enter department: ");
                    String dDepartment = scanner.nextLine();
                    System.out.print("Enter salary: ");
                    double dSalary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter programming language: ");
                    String dLang = scanner.nextLine();
                    employees[count++] = new Developer(dName, dDepartment, dSalary, dLang);
                    System.out.println("Developer added successfully!");
                    break;
                    
                case 3:
                    if (count == 0) {
                        System.out.println("No employees in the system.");
                        break;
                    }
                    System.out.println("\n--- Employee List (" + count + " employees) ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Employee #" + (i + 1) + ":");
                        employees[i].displayInfo();
                        System.out.println("----------------------");
                    }
                    break;
                    
                case 4:
                    if (count == 0) {
                        System.out.println("No employees added yet.");
                        break;
                    }
                    employee highest = employees[0];
                    for (int i = 1; i < count; i++) {
                        if (employees[i].getSalary() > highest.getSalary()) {
                            highest = employees[i];
                        }
                    }
                    System.out.println("\n--- Employee with Highest Salary ---");
                    highest.displayInfo();
                    break;
                    
                case 5:
                    System.out.println("Exiting... Thank you for using Employee Management System!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}