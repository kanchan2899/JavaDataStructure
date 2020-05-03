package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingWithComparable {
    public static void main(String[] args) {
        ArrayList<Emp> arrayList = new ArrayList<>();
        arrayList.add(new Emp("Emp1", 10000));
        arrayList.add(new Emp("Emp2", 9000));
        arrayList.add(new Emp("Emp3", 15000));

        System.out.println("Employee before the sort based on their salaries: \n" + arrayList);
        Collections.sort(arrayList);
        System.out.println("Employee after the sort based on their salaries: \n" + arrayList);
        System.out.println("Employee with highest salary: " + Collections.max(arrayList));
        System.out.println("Employee with least salary: " + Collections.min(arrayList));

    }
}

class Emp implements Comparable<Emp>{

    String name;
    int salary;

    Emp(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    int getSalary() { return this.salary; }

    @Override
    public int compareTo(Emp emp) {
        if(this.salary > emp.salary)    return 1;
        else if(this.salary < emp.salary)   return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
