package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

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
        al.add(3,"Four");
        al.add(4, "Five");
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

        // Clearing al and a
        System.out.println("Clearing both lists");
        al.clear();
        a.clear();

        //ArrayList Iterator
        System.out.println("Adding elements to al");
        for(int i=0; i<20; i++){
            al.add("Chocolate"+i);
        }

        System.out.println("List al: " + al);

        System.out.println("Traversing the list using iterator");
        Iterator<String> i = al.iterator();
        while(i.hasNext()){
            String x = i.next();
            if(x.equals("Chocolate2")) i.remove();
            else continue;
        }

        System.out.println("After removal, the list is: " + al);

    }

}
