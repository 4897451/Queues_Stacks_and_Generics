public class Queue<T> extends LinkedList<T> {
    //Can also just call, length - "size" and then change
    //method public int size()
    private int length;
    //Since I am now extending LL class, This is duplicating of head in LL.
    //"extends" did that for me.
    //todo: this will be commented out as "list" will be replaced with "head"
//    private LinkedList<T> list;

    public Queue()
    {
        this.head = null;
        this.length = 0;
    }

    public Queue(Node<T> list)
    {
        this.head = list;
        this.length = length();
    }

    public T dequeue()
    {
        --length;
        return removeFirst();
    }

    public void enqueue(T value)
    {
        this.append(value);
        ++length;
    }

    // Since extending from LL it already has this method.
//    public T peek()
//    {
//        return peek();
//    }
//
    public int size()
    {
        return length;
    }
}
