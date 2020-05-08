package collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEmployee {
    public static void main(String[] args) {
        LinkedList<Emp> empLinkedList = new LinkedList<>();

        empLinkedList.add(new Emp(1, "A"));
        empLinkedList.add(new Emp(2, "B"));
        empLinkedList.add(new Emp(3, "C"));
        empLinkedList.add(new Emp(4, "D"));

        System.out.println("Employee LinkedList using iterator: ");

        Iterator<Emp> iterator = empLinkedList.iterator();
        while (iterator.hasNext()){
            Emp e = iterator.next();
            System.out.println(e.id + " " + e.name);
        }

        System.out.println("Adding employee at the start and end of the list:");

        empLinkedList.addFirst(new Emp(0, "O"));
        empLinkedList.addLast(new Emp(5, "E"));

        iterator = empLinkedList.iterator();

        while(iterator.hasNext()){
            Emp e = iterator.next();
            System.out.println(e.id + " " + e.name);
        }

        System.out.println("Get first employee: ");
        Emp firstEmp = (Emp) empLinkedList.get(0);
        System.out.println(firstEmp.id + " " + firstEmp.name);

        System.out.println("Set first employee's name to Z");
        Emp temp = new Emp(0, "Z");
        empLinkedList.set(0, temp);
        firstEmp = (Emp) empLinkedList.get(0);
        System.out.println(firstEmp.id + " " + firstEmp.name);

        System.out.println("Remove first and last element: ");
        empLinkedList.removeFirst();
        empLinkedList.removeLast();
        iterator = empLinkedList.iterator();

        while(iterator.hasNext()){
            Emp e = iterator.next();
            System.out.println(e.id + " " + e.name);
        }

        System.out.println("Add an employee using index: ");
        temp = new Emp(5, "E");
        empLinkedList.add(4, temp);

        System.out.println("Remove third employee: ");
        empLinkedList.remove(2);

        iterator = empLinkedList.iterator();

        while(iterator.hasNext()){
            Emp e = iterator.next();
            System.out.println(e.id + " " + e.name);
        }
    }
}

class Emp{
    int id;
    String name;

    Emp(int id, String name){
        this.id = id;
        this.name = name;
    }
}
