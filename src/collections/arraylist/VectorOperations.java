package collections.arraylist;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorOperations {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(3, 2);
        System.out.println("Initial capactiy: " + vector.capacity());
        System.out.println("Initial size: " + vector.size());
        vector.addElement("A");
        vector.addElement("B");
        vector.addElement("C");
        System.out.println("Capacity after adding 3 elements: " + vector.capacity());
        System.out.println("Size after adding 3 elements: " + vector.size());

        System.out.println("Removing 3rd element");
        vector.removeElementAt(2);
        System.out.println("Vector after removing 3rd element: " + vector);

        System.out.println("Accessing elements using enumeration: ");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            String s = enumeration.nextElement();
            System.out.print(s + " ");
        }

        System.out.println("\nAccessing elements using iterator: ");
        Iterator<String> iterator = vector.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        vector.trimToSize();
        System.out.println("Capacity after calling trimTosize method:s " + vector.capacity());

        System.out.println("Converting vector to an array");
        String[] stringArray = new String[vector.size()];
        vector.copyInto(stringArray);

        for(String s : stringArray){
            System.out.print(s + " ");
        }
    }

}
