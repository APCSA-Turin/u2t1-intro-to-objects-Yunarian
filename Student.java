    // Student class definition
    public class Student {

    // instance variables
    private String name;
    private int age;
    private double gpa;

    // constructor
    public Student(String StudentName, int StudentAge, double StudentGpa) {
        name = StudentName;
        age = StudentAge;
        gpa = StudentGpa;
    }
    // method that introduces the Student
    public void introduce() {
        System.out.println("Hello, I am " + name + " and I am " + age + " years old.");
        System.out.println("My GPA is " + gpa);
    }

}