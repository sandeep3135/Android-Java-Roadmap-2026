package Java_Example_Question;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Standard Getter for Name
    public String getName() {
        return name;
    }

    // Standard Getter for ID
    public int getId() {
        return id;
    }

    // Fixed Getter for Salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double newTotalSalary) {
        if (newTotalSalary > this.salary) {
            this.salary = newTotalSalary;
            System.out.println("Promotion! New salary for id: "+id +", "+ name + " is: $" + salary);
        } else {
            System.out.println("Error: Cannot decrease salary for id: "+id +", "+ name);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee(101,"Ishan",25000);
        employees[1] = new Employee(100,"Prashant",15000);
        employees[2] = new Employee(105,"Vishal",35000);

        //employees[0].getSalary();
        employees[0].setSalary(25200);
        employees[2].setSalary(-200);


        System.out.println("-----------------Employee Details---------------");
        for (int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                System.out.println("Employee id: "+employees[i].getId()+ ", Employee name: "+employees[i].getName()+ ", Employee total salary: $"+employees[i].getSalary());
            }
        }

    }
}
