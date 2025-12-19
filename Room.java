public class Room {
    private String name;
    private int height;
    private double sizem2;
    public Room(String name,int height,double sizem2){
        this.name=name;
        this.height=height;
        this.sizem2=sizem2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSizem2() {
        return sizem2;
    }

    public void setSizem2(double sizem2) {
        this.sizem2 = sizem2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
