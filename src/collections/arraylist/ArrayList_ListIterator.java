package collections.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_ListIterator {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        ListIterator<String> listIterator = arrayList.listIterator();
        System.out.println("Traversing an ArrayList through ListIterator in a forward direction.");
        while(listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println("\nTraversing an ArrayList through ListIterator in a reverse direction.");
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }

}
