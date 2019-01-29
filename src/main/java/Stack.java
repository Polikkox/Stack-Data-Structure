public class Stack<E> {

    private E[] data;
    private int len;
    private final int MAXSIZE = 500;

    @SuppressWarnings({"unchecked"})
    public Stack(){
        this.data = (E[]) new Object[MAXSIZE];
        this.len = 0;
    }

    public void push(E element){
        if(len == maxSize()){
            throw new StackOutOfMemoryException("Stack is full");
        }
        data[len++] = element;
    }

    public E pop(){
        if((len - 1) < 0){
            throw new StackIsEmptyException("There is no any element left");
        }
        E element = peek();
        this.data[--len] = null;
        return element;
    }

    public E peek(){
        return this.data[len - 1];
    }

    public int size(){
        return this.len;
    }

    public int maxSize(){
        return this.MAXSIZE;
    }

    public int spaceLeft(){
        return this.MAXSIZE - size();
    }
}
