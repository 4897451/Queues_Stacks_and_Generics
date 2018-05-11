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
        Queue<Integer> ll = new Queue<>();
        System.out.println("\nLinkedList length = " + ll.length());
        ll.print();
        ll.append(111);
        System.out.println("* CREATED FIRST NODE *");
        System.out.println("\nLinkedList length = " + ll.length());
        ll.print();
        System.out.println();
        ll.append(222);
        ll.append(333);
        System.out.println("* Finished appending and creating the LinkedList. 111,222,333 *");
        System.out.println("\nLinkedList length = " + ll.length());
        ll.print();
        System.out.println();
        System.out.println("* Prepend Method (added 444 to beginning) *");
        ll.prepend(444);
        System.out.println("\nLinkedList length = " + ll.length());
        ll.print();
        System.out.println();
        System.out.println("* REMOVE AT INDEX 0 *");
        ll.removeAt(0);
        System.out.println("\nLinkedList length = " + ll.length());
        ll.print();
        System.out.println();
        System.out.println("* REMOVE FIRST *");
        ll.removeFirst();
        System.out.println("\nLinkedList length = " + ll.length());
        ll.print();
        System.out.println();
        System.out.println("* REMOVE LAST *");
        ll.removeLast();
        System.out.println("\nLinkedList length = " + ll.length());
        ll.print();

        /*
         * Random for insertAt() method
         */
        System.out.println("\n* STARTING RANDOM INSERT AT INDEX *\n");
        Random r = new Random();
        int i = 0, num = 5;
        do
        {
            ll.print();
            System.out.println("LinkedList length = " + ll.length() + "\n");
            int value = r.nextInt(10);
            int position = r.nextInt(6);
            System.out.println("Inserting value: " + "*" + value * 111 + "*" + " at index: " + position);
            /*
             * Calling insertAt() method
             */
            try
            {
                ll.insertAt(value * 111, position);
            } catch (IndexOutOfBoundsException e)
            {
                //TODO: whatever. Exception is held with a try/catch
                // (will continue until random has legal index value)
                continue;
            }
            ++i;
        } while (i < num);
        ll.print();
        System.out.println("Final LinkedList length = " + ll.length());
    }
}
