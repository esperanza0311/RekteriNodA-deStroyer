public class Test {
    static void main() {
        Room guestroom=new Room("GuestRoom",3,40);
        Building BlueHotel=new Building("Blue Hotel",guestroom,50);
        System.out.println("The total area of blue hotel is: " + BlueHotel.getTotalArea());


        Owner[] owner_list = new Owner[2];
        Building b2=new Building("Hotel XYZ",guestroom,25,owner_list);
        owner_list[0]=new Owner("Ali",123);

        b2.DisplayAllOwners();
        System.out.println("Name: " + b2.getowners()[0].getName() + " Date: " + b2.getowners()[0].getDate()) ;
        Owner [] owners2=b2.getOwners();
        System.out.println("Name: " + owner_list[1].getName() + " Date: " + owner_list[1].getDate()) ;
    }
}


