package employee;

// Abstract base class
public abstract class employee {
    protected String name;
    protected String department;
    protected double salary;
    
    public employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();
    
    // Concrete method
    public double getSalary() {
        return salary;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }
}