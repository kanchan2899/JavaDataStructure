package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {

    public static void main(String[] args) {

        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<String>());
        synchronizedList.add("A");
        synchronizedList.add("B");
        synchronizedList.add("C");

        Iterator<String> iterator = synchronizedList.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }


    }

}
