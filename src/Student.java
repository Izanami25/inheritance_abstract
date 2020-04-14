import java.net.StandardSocketOptions;

public class Student extends Employee {

    public static void main(String[] args) {
        /*Employee Damir = new Employee();
        Student Didar = new Student();
        System.out.println(Damir.salary);
        System.out.println(scholarship);
        System.out.println(Didar.salary);
        System.out.println(Didar.scholarship);*/
        Employee Damir = new Employee();
        System.out.println("The overall income is: ");
        System.out.println(Damir.Overall_Income());
    }
}
