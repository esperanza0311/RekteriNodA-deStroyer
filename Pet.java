public class Pet {
    private String name;
    private String owner;
    private int age;
    private boolean isMale;
    public Pet(String name,int age,boolean isMale){
        this.name=name;
        this.age=age;
        this.isMale=isMale;
    }
    public Pet(int age,boolean isMale){
        this.age=age;
        this.isMale=isMale;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getOwner() {
        return owner;


    }
    public boolean isMale(){
        return isMale;
    }
    public void beAdopted(String owner,String name){
        this.owner=owner;
        this.name=name;
    }
    protected static boolean isNullOrEmpty(String s){
        if( s == null || s.isEmpty()){
            return true ;
        }
        return false;
    }
    protected boolean hasowner(){
        if(isNullOrEmpty(owner)){
            return true;
        }else
            return false;
    }
    public void changename(String name){
        if (hasowner()==true){

        }
    }
}



