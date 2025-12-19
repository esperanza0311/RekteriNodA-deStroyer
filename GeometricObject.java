import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dataeCreated;
    public GeometricObject(){

    }
    public GeometricObject(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDataeCreated() {
        return dataeCreated;
    }

    public void setDataeCreated(Date dataeCreated) {
        this.dataeCreated = dataeCreated;
    }
    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "Date created " + this.dataeCreated + " Color : " +this.color + " Filled : " +this.filled;
    }

}

