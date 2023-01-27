package day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    /*
    "Queue"larda ilk gelen ilk isleme girer.(First In First Out==> FIFO)
    yemek sirketine application yaparsan son kullanma tarihine dikkat etmek icin ise yarar.
    bAZEN DE SON GELEN ILK ISLEME GIRER.(last In First Out==>LIFO)
    "Deque"  "Double Enden Queue"  iki uclu hem basi hem sonu calisir. hem FIFO hem LIFO icin kullanilir.

     "Queue" bir interface'tir. Bu yuzden constructor"i yoktur. Dolayisiyla object olustururken new keyword'unden sonra kullanilamaz 
     Data type 'i Queue olan bir object olusturmak icin new keyword'unden sonrai)LinkedList veya ii) PriorityQueue classlari kullanilir  
     */

    public static void main(String[] args) {

        Queue<String> myQueue= new LinkedList();// newden sonraki mutlaka class olmali Queue interface tir
        myQueue.add("Milk");
        myQueue.add("Butter");
        myQueue.add("Jam");
        myQueue.add("Egg");
        myQueue.add("Luxury water");

        System.out.println("myQueue = " + myQueue);//myQueue = [Milk, Butter, Jam, Egg, Luxury water]LinkedList kullandiginizdan sirali dizdi

        //Retrieves and removes the head of this queue, or returns null if this queue is empty.
        myQueue.poll();

        //Retrieves and removes the head of this queue. This method differs from poll()
        // only in that it throws an exception if this queue is empty.
        //Returns:the head of this queue
        //Throws:NoSuchElementException – if this queue is empty
        myQueue.remove();

        //Retrieves, but does not remove, the head of this queue.
        // This method differs from peek only in that it throws an exception if this queue is empty.
        //Returns:the head of this queue
        //Throws: NoSuchElementException – if this queue is empty
        myQueue.element();

        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        //Returns:the head of this queue, or null if this queue is empty
        myQueue.peek();

        /*
        poll() ile remove() ikisi de ilk elemani siler size verir.
        poll() bos "Queue" lar icin "null" verir, remove() ise bos "Queue"lar icin Exception atar.
        
         element() ile peek() ikisi de ilk elemani silmeden size verir.
        peek() bos "Queue" lar icin "null" verir, element() ise bos "Queue"lar icin Exception atar.
         */
        
        
        /*Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
         When using a capacity-restricted queue, this method is generally preferable to add,
         which can fail to insert an element only by throwing an exception.
        Returns:true if the element was added to this queue, else false

      
        Throws:
        ClassCastException – if the class of the specified element prevents it from being added to this queue
        NullPointerException – if the specified element is null and this queue does not permit null elements
      IllegalArgumentException – if some property of this element prevents it from being added to this queue

       " Queue "olustururken constructor olustururken" PriortyQueue" kullanirsaniz elemanlari
       kendi belirlediginiz kurala gore siralama hakkiniz olur
        */

        myQueue.offer("Avocado");
        System.out.println("myQueue = " + myQueue);//myQueue = [Jam, Egg, Luxury water, Avocado] ekleme yapma icn kullanilir. add() gibi


        Queue<String>yourQueue= new PriorityQueue<>();// newden sonraki mutlaka class olmali Queue interface tir
        yourQueue.add("Milk");
        yourQueue.add("Butter");
        yourQueue.add("Jam");
        yourQueue.add("Egg");
        yourQueue.add("Luxury water");
        System.out.println("yourQueue = " + yourQueue);//yourQueue = [Butter, Egg, Jam, Milk, Luxury water]















    }
}
