package day32collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {

        Deque<Integer>dq=new LinkedList<>();

        dq.add(12);
        dq.add(5);
        dq.add(18);
        dq.add(9);
        dq.add(1);
        System.out.println("dq = " + dq);//dq = [12, 5, 18, 9, 1] verdigimiz siraya gore yazdi

        dq.getFirst();dq.getLast();
       // dq.addLast();dq.addFirst();
        dq.peekFirst();dq.peekLast();//silmez ama gosterir ne oldugunu
        System.out.println("dq = " + dq);




    }
}
