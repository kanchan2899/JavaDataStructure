package collections;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        int x[] = {-3, -2, -1, 0, 1, 2, 3};
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("ArrayList size before adding elements from array: " + al.size());
        for (int i=0; i<x.length; i++){
            al.add(x[i]);
        }

        System.out.println("ArrayList size after adding elements from array: " + al.size());

        // Converting ArrayList into an array using toArray function
        Object o[] = al.toArray();
        System.out.println("Printing converted array");
        for(int i=0; i<o.length; i++){
            Integer z = (Integer) o[i];
            System.out.print(o[i] + " ");
            System.out.print(z.intValue() + " ");
        }
        System.out.println();
        System.out.println("Printing ArrayList content");
        for (Integer i : al){
            System.out.print(i.intValue() + " ");
        }
    }
}
