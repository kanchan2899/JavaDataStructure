package collection;

import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {
        // ArrayList with Generics
        ArrayList<String> al = new ArrayList<>();

        // ArrayList without Generics
        ArrayList a = new ArrayList();

        // Check the size
        System.out.println("List al size: " + al.size());
        System.out.println("List a size: " + a.size());

        // Add elements to list al
        System.out.println("List al: ");
        al.add("One");
        al.add("Two");
        al.add("Three");
        System.out.println(al);

        // Add elements to list a
        System.out.println("List a: ");
        a.add(1);
        a.add("Two");
        a.add(3);
        System.out.println(a);

        // Remove elements from List al
        System.out.println("Removed element" + al.remove(2));
        System.out.println("List al: " + al);
        System.out.println("List al size: " + al.size());

        // Remove elements from List a
        System.out.println("Removed element" + a.remove(2));
        System.out.println("List a: " + a);
        System.out.println("List a size: " + a.size());



    }

}
