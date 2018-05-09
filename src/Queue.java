public class Queue<T> extends LinkedList<T> {
    //Can also just call, length - "size" and then change
    //method public int size()
    private int length;
    //Since I am now extending LL class, This is duplicating of head in LL.
    //"extends" did that for me.
    //todo: this will be commented out as "list" will be replaced with "head"
    private LinkedList<T> list;

    public Queue()
    {
        this.list = null;
        this.length = 0;
    }

    public Queue(LinkedList<T> list)
    {
        this.list = list;
        this.length = list.length();
    }

    public T dequeue()
    {
        --length;
        return list.removeFirst();
    }

    public void enqueue(T value)
    {
        this.list.append(value);
        ++length;
    }

    public T peek()
    {
        return list.peek();
    }

    public int size()
    {
        return length;
    }
}
