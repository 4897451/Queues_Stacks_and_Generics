/*
 * Jonathan Jumper
 * CS241 JAVA II
 * edu.wwcc.CS_241.Jumper.Jonathan.Queue
 * 5/10/2018
 */
package edu.wwcc.CS_241.Jumper.Jonathan.Queue;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Queue<Integer> queue = new Queue<>();

        /*
         * Random for insertAt() method
         */
        System.out.println("\n* STARTING RANDOM INSERT AT INDEX *\n");
        Random r = new Random();
        int i = 0, num = 5;
        do
        {
            queue.print();
            System.out.println("LinkedList length = " + queue.length() + "\n");
            int value = r.nextInt(10);
            int position = r.nextInt(6);
            System.out.println("Inserting value: " + "*" + value * 111 + "*" + " at index: " + position);
            /*
             * Calling insertAt() method
             */
            try
            {
                queue.insertAt(value * 111, position);
            } catch (IndexOutOfBoundsException e)
            {
                //TODO: whatever. Exception is held with a try/catch
                // (will continue until random has legal index value)
                continue;
            }
            ++i;
        } while (i < num);
        System.out.println("\nQueueing method testing");
        System.out.println("Enqueueing");
        queue.print();
        System.out.println("Final LinkedList length = " + queue.size());
        queue.enqueue(101);
        System.out.println("Dequeueing");
        queue.print();
        System.out.println("Final LinkedList length = " + queue.size());
        queue.dequeue();
        queue.print();
        System.out.println("Final LinkedList length = " + queue.size());
        queue.print();
        System.out.println("Peeking at top value = " + queue.peek());
        queue.print();
    }
}
