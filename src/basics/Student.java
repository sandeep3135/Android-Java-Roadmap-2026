package basics;

// The Simple Student Grade Manager

public class Student {

    public void calculateGrade(int grade){
        if (grade > 100){
            System.out.println("Invalid Score");
        } else if (grade >= 90){
            System.out.println("Grade: A");
        } else if (grade >= 80){
            System.out.println("Grade : B");
        } else {
            System.out.println("Grade: Needs Improvement");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("Testing Grade :105 ");
        s1.calculateGrade(105);

        System.out.println("Testing Grade :92 ");
        s1.calculateGrade(92);

        System.out.println("Testing Grade :85 ");
        s1.calculateGrade(85);

        System.out.println("Testing Grade :62 ");
        s1.calculateGrade(62);
    }
}

