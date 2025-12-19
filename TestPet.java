public class TestPet {
    static void main(String[] args) {
        Pet p1 =new Pet(3,true);
        System.out.println(p1.isMale());
        Dog d1=new Dog(3,true,"white","sivas kangal");
        d1.beAdopted("Peter","Lassie");
        System.out.println("Dogs name is :"+d1.getName() + " Peters age is : " + d1.getHumanage());
        d1.speak();
    }



}
