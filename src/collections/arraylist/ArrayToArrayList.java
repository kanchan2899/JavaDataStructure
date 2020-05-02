package collections.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {
        String cities[] = {"Delhi", "Mumbai", "Pune", "Bangalore"};

        System.out.println("Converting array into list first using Arrays.asList(String[] a) method");
        List<String> citiesList = Arrays.asList(cities);
        System.out.println("Then Converting that list into an ArrayList");
        ArrayList<String> citiesArrayList = new ArrayList<>(citiesList);

        Iterator i = citiesArrayList.iterator();
        System.out.println("Content of ArrayList: ");
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }

    }

}
