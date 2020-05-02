package collections.arraylist;

import java.util.ArrayList;

public class ArrayListContainsMethod {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee(1001);
        employees.add(e1);
        employees.add(new Employee(1002));
        employees.add(new Employee(1003));
        employees.add(new Employee(1004));

        System.out.println("ArrayList contains the employee id 1001? " + employees.contains(e1));
    }
}
