public class queue {
    public node head;
    public node rear;
    public int size=0;
    public queue(){
        this.head=null;
        this.rear=null;
    }
    public void enqueue(int data){
        node newnode=new node(data);
        if (isEmpty()){
            head=rear=newnode;
            size++;
        }
        rear.next=newnode;
        rear=newnode;
        size++;

    }public boolean isEmpty(){
        return head==null;
    }
    public int dequeue(){
        if (isEmpty()){throw new RuntimeException("This queue is empty");}
        else if (head==rear){
            int value=head.data;
            head=rear=null;
            size--;
            return value;
        } else {
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    }
    public boolean areEqual(queue q1,queue q2){
      if (q1.size!=q2.size){
          return false;
      }node temp1 =q1.head;
      node temp2 =q2.head;
      while(temp1 != null && temp2 !=null){
          if (temp1.data != temp2.data){
              return false;
          }
          temp1 = temp1.next;
          temp2 = temp2.next;
      }return true;



    }
}
