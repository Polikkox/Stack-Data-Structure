public class Stack<E> {

    private E[] data;
    private int len;

    @SuppressWarnings({"unchecked"})
    public Stack(){
        this.data = (E[]) new Object[501];
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
}
