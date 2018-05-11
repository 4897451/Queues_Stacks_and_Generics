/*
 * Jonathan Jumper
 * CS241 JAVA II
 * edu.wwcc.CS_241.Jumper.Jonathan.Queue
 * 5/10/2018
 */
package edu.wwcc.CS_241.Jumper.Jonathan.Queue;

import edu.wwcc.CS_241.Jumper.Jonathan.SingleLL.LinkedList;
import edu.wwcc.CS_241.Jumper.Jonathan.SingleLL.Node;

/**
 *
 */
public class Queue<L> extends LinkedList {
    //Can also just call, length - "size" and then change
    //method public int size()
    private int length;
    //Since I am now extending LL class, This is duplicating of head in LL.
    //"extends" did that for me.
    //todo: this will be commented out as "list" will be replaced with "head"
//    private edu.wwcc.CS_241.Jumper.Jonathan.edu.wwcc.CS_241.Jumper.Jonathan.BinaryTree.BinaryTree.LinkedList<T> list;

    public Queue()
    {
        this.head = null;
        this.length = 0;
    }

    public Queue(Node<L> list)
    {
        this.head = list;
        this.length = length();
    }

    public L dequeue()
    {
        --length;
        return removeFirst();
    }

    public void enqueue(L value)
    {
        this.append(value);
        ++length;
    }

    /**
     * Finds length of list.
     *
     * @return int
     */
    public int length()
    {
        /*
        Creates new variable count to store value of next
         */
        int count = 0;
        if (this.head != null)
        {
            Node<L> current = this.head;
            do
            {
                current = current.getNext();
                // ++ before because we're not using the value of count at this point
                // we're only returning the value of count when the condition is false
                ++count;
            } while (current != null);
        }
        return count;
    }
}
