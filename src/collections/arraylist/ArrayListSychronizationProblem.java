package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListSychronizationProblem {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        try{
            ArrayListT1 arrayListT1 = new ArrayListT1(arrayList);
            Thread t1 = new Thread(arrayListT1);
            ArrayListT2 arrayListT2 = new ArrayListT2(arrayList);
            Thread t2 = new Thread(arrayListT2);
            t1.setPriority(10);
            t1.start();
            t2.start();

        } catch (Exception e){

        }
    }

}

class ArrayListT1 implements Runnable{
    ArrayList<String> al;
    ArrayListT1(ArrayList al){ this.al = al; }

    public void run(){
        Iterator iterator = al.iterator();
        while(iterator.hasNext()){
            try{
                String s = (String) iterator.next();
                System.out.println(s);
                Thread.sleep(4000);
            } catch (Exception e){
                e.printStackTrace();
                System.exit(0);
            }
        }
    }

}

class ArrayListT2 implements Runnable{

    ArrayList<String> arrayList;

    ArrayListT2(ArrayList arrayList){
        this.arrayList = arrayList;
    }

    public void run(){
        try{
            for(int i=0; i<5; i++){
                arrayList.add("String" + i);
                arrayList.add("String");
                Thread.sleep(2000);
            }

        } catch (Exception e){}
    }

}