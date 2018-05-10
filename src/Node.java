/*
 * Jonathan Jumper
 * CS241 JAVA II
 * Linked Lists
 * 4-12-18
 */

/**
 * NODE CLASS
 */
@SuppressWarnings("WeakerAccess")
public class Node<T> {
    private Node<T> left;
    private Node<T> right;
    private T value;

    /**
     * Default value constructor.
     */
    public Node()
    {
        this.value = null;
        this.left = null;
        this.right = null;
    }

    /**
     * Value only constructor.
     *
     * @param value
     *     <T>
     */
    public Node(T value)
    {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    /**
     * Full constructor with Nodes.
     *
     * @param value
     * @param left
     * @param right
     */
    public Node(T value, Node<T> left, Node<T> right)
    {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /**
     * Full constructor with values.
     *
     * @param value
     * @param left
     * @param right
     */
    public Node(T value, T left, T right)
    {
        this.value = value;
        this.left = new Node<>(left);
        this.right = new Node<>(right);
    }

    /**
     * Optional value and left constructor.
     *
     * If you need this one probably should add one with right as well.
     *
     * @param value
     *     <T>
     * @param left
     *     Node<T>
     */
    public Node(T value, Node<T> left)
    {
        this.value = value;
        this.left = left;
    }
    // Begin Getters and Setters

    /**
     * @return Node<T>
     */
    public Node<T> getRight()
    {
        return right;
    }

    /**
     * @param value
     *     T
     */
    public Node<T> setRight(T value)
    {
        this.right = new Node<>(value);
        return this;
    }

    /**
     * @return Node<T>
     */
    public Node<T> getleft()
    {
        return left;
    }

    /**
     * Node<Integer> junk;
     * junk is an instance of Node<T>.
     * With fluent interface.
     * junk->setValue(5)
     * ->setLeft(1)
     * ->setRight(10);
     * <p>
     * Without fluent interface.
     * junk->setValue(5);
     * junk->setLeft(1);
     * junk->setRight(10);
     *
     * @param value
     *     T
     */
    public Node<T> setLeft(T value)
    {
        this.left = new Node<>(value);
        return this;
    }

    /**
     *
     * @param left
     *     Node<T>
     */
    public Node<T> setLeft(Node<T> left)
    {
        this.left = left;
        return this;
    }

    /**
     * @param right
     *     Node<T>
     */
    public Node<T> setRight(Node<T> right)
    {
        this.right = right;
        return this;

    }

    /**
     * @return <T>
     */
    public T getValue()
    {
        return this.value;
    }

    /**
     * @param value
     *     T
     */
    public Node<T> setValue(T value)
    {
        this.value = value;
        return this;
    }
}
