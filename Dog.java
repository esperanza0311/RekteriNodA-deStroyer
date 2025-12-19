public class Dog extends Pet{
    private String color ;
    private String breed;
    public Dog(){

    }

    public Dog( String name,int age ,boolean isMale, String color,String breed){
        super(name,age,isMale);
        this.color=color;
        this.breed=breed;
    }
    public Dog(int age, boolean isMale, String color, String breed){
        super(age, isMale);
        this.color=color;
        this.breed=breed;
    }
    public void speak(){
        System.out.println("Woof");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getHumanage(){
        return 7* this.getAge();
    }


}
