package collections.arraylist;

import java.util.ArrayList;

public class ArrayListCloning {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        System.out.println("Original ArrayList: " + arrayList);

        System.out.println("Cloning the original array using clone() method and this is a shallow copy of original ArratList");

        ArrayList<String> clonedArrayList = (ArrayList)arrayList.clone();

        System.out.println("Cloned ArrayList: " + clonedArrayList);

        if(arrayList.get(0) == clonedArrayList.get(0)){
            System.out.println("It's a shallow copy because first element of both the lists points to the same address");
        }


        if(arrayList != clonedArrayList) System.out.println("Cloned ArrayList");
    }
}
