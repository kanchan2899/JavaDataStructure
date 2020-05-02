package collections.arraylist;

import sun.tools.tree.NewArrayExpression;

import java.io.ObjectInputStream;
import java.util.Iterator;

public class CustomizedArrayList {

    public static void main(String[] args) {
        NewArrayList<String> arrayList = new NewArrayList<>();
        Iterator iterator = arrayList.iterator();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println("ArrayList Content: " + arrayList);

        iterator.remove();

        System.out.println("ArrayList Content after removal: " + arrayList);

        System.out.println("Size of the list " + arrayList.size());
        System.out.println("Capacity: " + arrayList.capacity());

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        }
}

class NewArrayList<T> implements Iterator{

    int size;
    Object objects[];
    float growth = 0.5f;
    int index = -1;
    int next = 0;

    public NewArrayList(){
        size = 10;
        objects = new Object[size];
    }

    public NewArrayList(int size){
        this.size = size;
        objects = new Object[size];
    }

    public void add(T obj){
        // System.out.println(obj.getClass().getName());
        if(index+1 == size){
            int tempSize = size + new Float(size * growth).intValue();
            Object tempObj[] = new Object[tempSize];
            size = tempSize;

            for(int i=0; i<objects.length; i++){
                tempObj[i] = objects[i];
            }
            objects = tempObj;
        }
        objects[++index] = obj;
    }

    public void addAll(T o[]){
        for(int i=0; i<o.length; i++){
            add(o[i]);
        }
    }

    public boolean set(int i, T obj){
        if(i<0) return false;
        else if (i>index){
            add(obj);
            return true;
        }
        else{
            objects[i] = obj;
            return true;
        }
    }

    public String toString(){
        String str = "";
        for(int i=0; i<=index; i++){
            str += "{" + objects[i].toString() + "}";
        }
        return str;
    }

    public int size(){
        return index++;
    }

    public void remove(){
        index--;
    }

    public boolean isEmpty(){
        return index == -1;
    }

    public int capacity(){
        return objects.length;
    }

    Iterator iterator(){
        return this;
    }

    @Override
    public boolean hasNext() {
        if(next > index) return false;
        else return true;
    }

    @Override
    public Object next() {
        return objects[next++];
    }
}