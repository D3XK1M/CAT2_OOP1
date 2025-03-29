package Q1A_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 105);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());
    }
}

