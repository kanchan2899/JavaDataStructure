package collections.arraylist;


import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class ArrayListSerialization {

    public static void main(String[] args) {

        System.out.println("Serialization of an ArrayList of type String");
        ArrayList<String> al = new ArrayList<>();
        al.add("Hey");
        al.add("Hiya");
        al.add("Hola");
        System.out.println("Content of ArrayList: " + al);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("Resources/file-1.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(al);

            System.out.println("After deserialization");
            FileInputStream fileInputStream = new FileInputStream("Resources/file-1.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            ArrayList arrayList = (ArrayList)objectInputStream.readObject();

            System.out.println(arrayList);


            System.out.println("\nSerialization of ArrayList of type Employee");
            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(new Employee(1));
            employees.add(new Employee(2));
            employees.add(new Employee(3));

            System.out.println("Content of ArrayList: " + employees);
            objectOutputStream.writeObject(employees);
            System.out.println("After deserialization");
            ArrayList arrayList1 = (ArrayList) objectInputStream.readObject();
            System.out.println(arrayList1);


        } catch(Exception e){
            e.printStackTrace();
        }

    }
}

class Employee implements Serializable{
    int id;
    Employee(int id){this.id = id;}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
