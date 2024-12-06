package workshop2;

public class Task4 {
    protected String address;
}
class Employee extends Task4{
    protected String department;
    Employee(String department, String address) {
        this.department = department;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee e = new Employee("CEO", "Naxal-Kathmandu");
        System.out.println(e.department);
        System.out.println(e.address);
    }
}