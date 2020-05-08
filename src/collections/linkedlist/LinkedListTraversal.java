package collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTraversal {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        System.out.println("Traversal through for loop: ");
        for(int i=0; i<linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }

        System.out.println("Traversal through advanced for loop:");
        for(String s : linkedList){
            System.out.println(s);
        }

        System.out.println("Traversal through an iterator: ");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Traversal through a descending iterator:");
        iterator = linkedList.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Traversal through lambda expression:");
        linkedList.forEach(s -> System.out.println(s + " "));
    }
}
