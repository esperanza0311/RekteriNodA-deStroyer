import java.util.ArrayList;

public class stackal {
    private ArrayList<Integer> list;

    public stackal() {
        list = new ArrayList<>();
    }
    public void push(int x){
        list.add(x);
        System.out.println(x+"added");
    }
    public int pop(){
        if (list.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int value=(list.size()-1);
        list.remove(list.size()-1);
        System.out.println(value + " çıkarıldı.");
        return value;
    }
    public boolean isEmpty(){
            return list.isEmpty();

    }
    public int peek(){
        if (list.isEmpty()){
            throw new RuntimeException("STack is empty");
        }return list.get(list.size()-1);
    }
    public int size(){
        return list.size();
    }
    public void printStack() {
        System.out.println("Stack: " + list);
    }

}
