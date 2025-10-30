public class studentList {
    student current;
    student tail;
    student head;


    public void addstudent(int id,String name,String surname){
        student newstudent=new student(id,name,surname);
        if (head==null){
            head=tail=current=newstudent;
        }else {
            tail.next=newstudent;
            newstudent.prev=tail;
            tail=newstudent;
        }
        System.out.println("Eklendi:"+newstudent);
    }
    public void removestudent(int id){
        student temp=head;
        while(temp!=null && temp.id!=id){
            temp=temp.next;
        }
        if (temp==null){
            System.out.println("Kaldırılmak istenen öğrenci bulunamadı.");
        }
        if (temp==head){
            head=temp.next;
            if(head!=null){
                head.prev=null;
            }else{
                tail=null;
            }
        }

        else if (temp==tail){
                tail=temp.prev;
                tail.next=null;
        }
        else {
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }System.out.println(temp+"kaldırıldı.");

    }
    public void nextstudent(){
        if (current!=null && current.next!=null){
            current=current.next;
            System.out.println("Sıradaki öğrenci ->"+current);
        }else {
            System.out.println("Zaten sıranın sonundasınız.");
        }
    }
    public void prevstudent(){
        if (current!=null && current.prev!=null){
            current=current.prev;
            System.out.println("Önceki öğrenci ->"+current);
        }else{
            System.out.println("Zaten ilk öğrencidesiniz.");
        }
    }
    public void currstudent(){
        if (current!=null){
            System.out.println("Şuanki öğrenci ->"+current);
        }else{
            System.out.println("Bu liste boş, lütfen listeye öğrenci ekleyiniz.");
        }
    }
    public void showlist(){
        student temp=head;
        while(temp!=null){
            System.out.print(temp+"->");
            temp=temp.next;
        }
        System.out.println("Listenin sonundasınız");
    }
}
