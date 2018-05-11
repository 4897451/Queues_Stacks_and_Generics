/*
 * Jonathan Jumper
 * CS241 JAVA II
 * edu.wwcc.CS_241.Jumper.Jonathan.Stack
 * 5/10/2018
 */
package edu.wwcc.CS_241.Jumper.Jonathan.Stack;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        System.out.println("\nLinkedList length = " + stack.length());
        stack.print();
        stack.append(111);
        System.out.println("* CREATED FIRST NODE *");
        System.out.println("\nLinkedList length = " + stack.length());
        stack.print();
        System.out.println();
        stack.append(222);
        stack.append(333);
        System.out.println("* Finished appending and creating the LinkedList. 111,222,333 *");
        System.out.println("\nLinkedList length = " + stack.length());
        stack.print();
        System.out.println();
        System.out.println("* Prepend Method (added 444 to beginning) *");
        stack.prepend(444);
        System.out.println("\nLinkedList length = " + stack.length());
        stack.print();
        System.out.println();
        System.out.println("* REMOVE AT INDEX 0 *");
        stack.removeAt(0);
        System.out.println("\nLinkedList length = " + stack.length());
        stack.print();
        System.out.println();
        System.out.println("* REMOVE FIRST *");
        stack.removeFirst();
        System.out.println("\nLinkedList length = " + stack.length());
        stack.print();
        System.out.println();
        System.out.println("* REMOVE LAST *");
        stack.removeLast();
        System.out.println("\nLinkedList length = " + stack.length());
        stack.print();

        /*
         * Random for insertAt() method
         */
        System.out.println("\n* STARTING RANDOM INSERT AT INDEX *\n");
        Random r = new Random();
        int i = 0, num = 5;
        do
        {
            stack.print();
            System.out.println("LinkedList length = " + stack.length() + "\n");
            int value = r.nextInt(10);
            int position = r.nextInt(6);
            System.out.println("Inserting value: " + "*" + value * 111 + "*" + " at index: " + position);
            /*
             * Calling insertAt() method
             */
            try
            {
                stack.insertAt(value * 111, position);
            } catch (IndexOutOfBoundsException e)
            {
                //TODO: whatever. Exception is held with a try/catch
                // (will continue until random has legal index value)
                continue;
            }
            ++i;
        } while (i < num);
        System.out.println("\nStacking method testing");
        stack.print();
        System.out.println("Final LinkedList size = " + stack.size());
        System.out.println("Pushing");
        stack.push(101);
        stack.print();
        System.out.println("Final LinkedList size = " + stack.size());
        System.out.println("Popping");
        stack.pop();
        stack.print();
        System.out.println("Final LinkedList size = " + stack.size());
        stack.print();
        System.out.println("Peeking at top value = " + stack.peek());
        stack.print();
    }
}
