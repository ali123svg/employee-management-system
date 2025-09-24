package employee;

public class Manager extends employee {
    private double bonus;
    
    public Manager(String name, String department, double salary, double bonus) {
        super(name, department, salary);
        this.bonus = bonus;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Base Salary: $" + salary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + (salary + bonus));
    }
    
    @Override
    public double getSalary() {
        return salary + bonus; // Total salary including bonus
    }
    
    public double getBonus() {
        return bonus;
    }
}