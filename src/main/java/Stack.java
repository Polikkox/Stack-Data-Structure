public class Stack<E> {

    private E[] data;
    private int len;
    private final int MAXSIZE = 501;

    @SuppressWarnings({"unchecked"})
    public Stack(){
        this.data = (E[]) new Object[MAXSIZE];
        this.len = 0;
    }

    public void push(E element){
        data[len++] = element;
    }

    public E pop(){
        E element = peek();
        this.data[--len] = null;
        return element;
    }

    public E peek(){
        return this.data[len - 1];
    }

    public int size(){
        return this.len - 1;
    }

    public int maxSize(){
        return this.MAXSIZE;
    }
}
