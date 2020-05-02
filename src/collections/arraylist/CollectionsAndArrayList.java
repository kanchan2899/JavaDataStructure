package collections.arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsAndArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");

        System.out.println("Original list: " + arrayList);

        System.out.println("Reverse the ArrayList using Collections.reverse(al) method.");

        Collections.reverse(arrayList);

        System.out.println("After list reversal: " + arrayList);

        System.out.println("Shuffle the ArrayList using Collections.shuffle(al) methos.");

        Collections.shuffle(arrayList);

        System.out.println("After shuffling, the list is:" + arrayList);

        System.out.println("Swap the elements in the ArrayList using Collections.swap(al, index1, index2) method.");

        Collections.swap(arrayList, 0, 1);

        System.out.println("After swap, the list is: " + arrayList);
    }
}
