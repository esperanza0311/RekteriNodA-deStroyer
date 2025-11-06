public class MyStack {
    private stack top;
    private int size=0;
    private int capacity;
    private stack middle;
    public MyStack(int x){
        top=null;
        middle=null;
        capacity=x;

    }

    public void push(int x){
        if (size == capacity) throw new RuntimeException("This stack is full");
        stack newstack = new stack(x);
        newstack.next = top;
        top = newstack;
        if(size==1)this.middle=this.top;
        if (size % 2 == 1) this.middle=this.middle.next;
        size++;
    }
    public int pop(){
        if (size==0){
            throw new RuntimeException("This stack is full");
        }
        if (size==1) this.middle=this.top;
        else if (size %2 == 1) this.middle=this.middle.next;
        int val= top.data;
        top=top.next;
        size--;
        return val;
    }

}
