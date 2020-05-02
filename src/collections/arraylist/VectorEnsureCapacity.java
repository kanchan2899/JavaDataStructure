package collections.arraylist;


import java.util.ArrayList;
import java.util.Vector;

public class VectorEnsureCapacity {

    public static void main(String[] args) {

        //ArrayList<String> al = new ArrayList<>(4);
        //ArrayList also has same behavior but ArrayList doesn't have capacity function, so demonstrating it with vector.
        Vector<String> vector = new Vector<>(4);
        System.out.println("Vector capacity after initializing it to 4" + vector.capacity());

        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("d");

        vector.ensureCapacity(10);
        System.out.println("Vector capacity after reinitialize it to 10: " + vector.capacity());

        System.out.println(vector);

    }

}
