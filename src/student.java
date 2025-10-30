public class student{
    int id;
    String name;
    String surname;
    student next;
    student prev;

    public student(int id,String name,String surname){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.next=null;
        this.prev=null;
    }
    public String toString(){
        return id+" "+name+" "+surname;
    }
}