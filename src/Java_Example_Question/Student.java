package Java_Example_Question;

//implement Details of Student class with constructor and this keyword

public class Student {


    String name;
    int rollNo;
    double marks;

    public Student(String studentName, int studentRoll, double studentMarks){

        this.name = studentName;
        this.rollNo = studentRoll;
        this.marks = studentMarks;
    }

    public void displayStudentDetails() {
        System.out.println("Student: " + name + " | Roll: " + rollNo + " | Marks: " + marks);
    }


    public static void main(String[] args) {
        Student myStudent1 = new Student("Sandeep", 10, 85);
        Student myStudent2 = new Student("Ishan", 1, 89);



        myStudent1.displayStudentDetails();
        myStudent2.displayStudentDetails();
    }
}
