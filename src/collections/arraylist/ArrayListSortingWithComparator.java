package collections.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortingWithComparator {
    public static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp("Emp3", 10000));
        empList.add(new Emp("Emp1", 9000));
        empList.add(new Emp("Emp2", 15000));

        System.out.println("");
    }
}

class SalaryComparator implements Comparator<Emp>{

    @Override
    public int compare(Emp o1, Emp o2) {
        if(o1.getSalary() > o2.getSalary()) return 1;
        else return -1;
    }
}

class NameComparator implements Comparator<Emp>{

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.name.compareTo(o2.name);
    }
}
