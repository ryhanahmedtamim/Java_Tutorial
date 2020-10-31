package first_test;
import java.util.ArrayList;
public class Main {
    public static void main(String args[])
    {
        Adder adder = new Adder(new ArrayList<Student>());
        Student s1 = new Student("Hridoy","1", new Address("8130", "Gopalganj"));
        Student s2 = new Student("Shakib","2", new Address("9201", "Khulna"));
        Student s3 = new Student("Dipto","3", new Address("1200", "Dhaka"));
        Student s4 = new Student("Shupto","4", new Address("1212", "Basbo"));
        Student s5 = new Student("Nirban","5", new Address("1230", "Badda"));
        adder.addStudent(s1);
        print("Number of Student added " + adder.numberOfAddedStudents());
        print("Number of Student created " + Student.getNumberOfStudents());
        adder.addStudent(s2);
        adder.addStudent(s3);
        print("Number of Student added " + adder.numberOfAddedStudents());
        print("Number of Student created " + Student.getNumberOfStudents());
        adder.addStudent(s4);
        print("Number of Student added " + adder.numberOfAddedStudents());
        print("Number of Student created " + Student.getNumberOfStudents());
        print(adder.toString());
        print("Number of Student added " + adder.numberOfAddedStudents());
        print("Number of Student created " + Student.getNumberOfStudents());
    }
    public static void print(Object o)
    {
        System.out.println(o);
    }
}
