package employee;

public class Developer extends employee {
    private String programmingLanguage;
    
    public Developer(String name, String department, double salary, String programmingLanguage) {
        super(name, department, salary);
        this.programmingLanguage = programmingLanguage;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Developer Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
    
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}