package first_test;
import java.util.ArrayList;

public class Adder {
    ArrayList<Student> students;

    public Adder(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student)
    {
        this.students.add(student);
    }

    public int numberOfAddedStudents()
    {
        return students.size();
    }

    @Override
    public String toString() {
        String resultString = "";
        for(int i=0; i<students.size(); i++)
        {
            resultString+=((i+1)+ " " + students.get(i).toString() + "\n");
        }
        return resultString;
    }

}
