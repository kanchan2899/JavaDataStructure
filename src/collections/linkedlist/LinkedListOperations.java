package collections.linkedlist;

import java.util.LinkedList;

public class LinkedListOperations {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("J");
        linkedList.add("B");
        linkedList.add("K");
        linkedList.add("C");
        linkedList.add("J");
        linkedList.add("D");
        linkedList.add("K");
        linkedList.add("E");
        linkedList.add("F");
        linkedList.add("G");
        linkedList.add("K");
        linkedList.add("H");
        linkedList.add("I");
        linkedList.add("J");
        linkedList.add("K");




        System.out.println("Content of LL: " + linkedList);

        linkedList.addFirst("-1");
        linkedList.addLast("6");

        System.out.println("Contents of LL after adding an element at the start and end of it: " + linkedList);

        System.out.println("Getting the first element: " + linkedList.get(0));

        System.out.println("Setting the first element to 'first': " + linkedList.set(0, "first") );

        System.out.println("Contents of LL after setting the first element: " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("Content of LL after removing first and last element: " + linkedList);

        linkedList.add(0, "first");
        System.out.println("Content of LL after adding first element: " + linkedList);

        linkedList.remove();
        System.out.println("Content of LL after remove() method - removes first element: " + linkedList);

        System.out.println("Get first element: " + linkedList.getFirst());
        System.out.println("Get last element: " + linkedList.getLast());

        linkedList.remove();
        System.out.println("LL after remove() method: " + linkedList);

        linkedList.remove(0);
        System.out.println("LL after remove(1) method: " + linkedList);

        linkedList.remove("C");
        System.out.println("LL after remove('C') method:" + linkedList);

        linkedList.removeFirst();
        System.out.println("LL after removeFirst() method: " + linkedList);

        linkedList.removeLast();
        System.out.println("LL after removeLast() method: " + linkedList);

        linkedList.removeFirstOccurrence("K");
        System.out.println("LL after removeFirstOccurence('K'): " + linkedList);

        linkedList.removeLastOccurrence("J");
        System.out.println("LL after removeLastOccurence('J'): " + linkedList);

        System.out.println("Get first element using getFirst(): " + linkedList.getFirst());
        System.out.println("Get first element using peekFirst(): " + linkedList.peekFirst());
        linkedList.push("L");
        System.out.println("LL after push('L'): " + linkedList);
        linkedList.pop();
        System.out.println("LL after pop(): " + linkedList);

    }
}
