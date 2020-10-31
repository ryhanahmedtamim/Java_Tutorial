package first_test;
public class Student {
    private String name;
    private String id;
    private Address address;

    private static int numberOfStudents = 0;

    public Student(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void setNumberOfStudents(int numberOfStudents) {
        numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address=" + address +
                '}';
    }
}
