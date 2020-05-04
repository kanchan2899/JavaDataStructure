package collections.arraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("A");
        copyOnWriteArrayList.add("B");
        copyOnWriteArrayList.add("C");
        copyOnWriteArrayList.add("D");

        try{

            ArrayListThread1 thread1 = new ArrayListThread1(copyOnWriteArrayList);
            Thread t1 = new Thread(thread1);

            ArrayListThread2 thread2 = new ArrayListThread2(copyOnWriteArrayList);
            Thread t2 = new Thread(thread2);

            t1.setPriority(10);
            t1.start();
            t2.start();
            t1.join();
            t2.join();

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(copyOnWriteArrayList);
    }

}

class ArrayListThread1 implements Runnable{

    CopyOnWriteArrayList<String> arrayList;

    ArrayListThread1(CopyOnWriteArrayList<String> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            try{
                String str = iterator.next();
                System.out.println(str);
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}


class ArrayListThread2 implements Runnable{

    CopyOnWriteArrayList<String> arrayList;

    ArrayListThread2(CopyOnWriteArrayList<String> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public void run(){

        for (int i=0; i<5; i++){
            arrayList.add("String" + i);
            arrayList.add("String");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

}