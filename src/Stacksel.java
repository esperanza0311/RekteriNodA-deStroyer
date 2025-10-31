import java.util.Stack;

public class Stacksel {
    private stack top;
    private int capacity;
    private int size;
    public Stacksel(int capacity){
        this.capacity=capacity;
        this.size=0;
        top=null;

    }

    public void push(int x){
        if (capacity==size){
            throw new RuntimeException("Stack dolu");
        }
        stack mystack=new stack(x);
        mystack.next=top;
        top=mystack;
        size++;
    }
    public int pop(){
        if (top==null){
            throw new RuntimeException("stack boşs");
        }int val=top.data;
        top=top.next;
        return val;
    }
    public int peek(){
        if (top==null){
            throw new RuntimeException("the stack is empty");
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int getSize(){
        return size;
    }
    public boolean isFull() {
        return size == capacity;
    }

}

