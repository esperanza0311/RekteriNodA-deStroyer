public class Building {
    private String name;
    private Room roomType;
    private int numOfRooms;
    private Owner[] owners;
    public Building(String name,Room roomType,int numOfRooms){
        this.name=name;
        this.roomType=roomType;
        this.numOfRooms=numOfRooms;
    }
    public Building(String name,Room roomType,int numOfRooms,Owner[] owners){
        this.name=name;
        this.roomType=roomType;
        this.numOfRooms=numOfRooms;
        this.owners=new Owner[numOfRooms];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public Room getRoomType() {
        return roomType;
    }

    public void setRoomType(Room roomType) {
        this.roomType = roomType;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }
    public double getTotalArea(){
        return numOfRooms*(roomType.getSizem2());
    }
    public Owner[] getowners() {
        return owners;
    }
    public void DisplayAllOwners(){
        for (Owner owner : owners) {
            System.out.println("Name: " + owner.getName() + " Date: " + owner.getDate());
        }
    }
}
