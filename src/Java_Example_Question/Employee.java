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

    public void getSalary(){

    }

    public void setSalary(double newSalary){

    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee(101,"Ishan",25000);
        employees[1] = new Employee(100,"Prashant",15000);
        employees[2] = new Employee(105,"Vishal",35000);

        employees[0].getSalary();


    }
}
