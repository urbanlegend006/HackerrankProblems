package myPackiage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {


    public static void main(String[] args) {
        Employee e1 = new Employee(10, "Anit", "QA");
        Employee e2 = new Employee(20, "David", "DEV");
        Employee e3 = new Employee(30, "Martin", "PMO");
        Employee e4 = new Employee(40, "Carlos", "BA");

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        empList.sort(new Employee());

        System.out.println(empList);

    }

}
