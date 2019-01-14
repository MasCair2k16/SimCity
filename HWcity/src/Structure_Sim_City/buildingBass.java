package Structure_Sim_City;


/**
 * This program demonstrates the buildingBass who is adult to School and cityHall
 * @author Mason Caird
 * @since 1-8-18
 */

public abstract class buildingBass {
    
    protected String name;
    protected String address;
    protected Integer rooms;

    /**Default Constructor...
    * Default Constructor for buildingBass. 
    * @method
    */
    buildingBass() {
        name = "Great Wold Lodge";
        address = "437 RiverLodge Rd, Chehalis, Washington";
        rooms = 23;
    }

    /**
    * Constructor...
    * Constructor for buildingBass. 
    * @method
    */
    buildingBass(String name, String address, int rooms) {
        this.name = name;
        this.address = address;
        this.rooms = rooms;
    }
    
    /** getFunctions
    * getFunctions to retrieve data for user from bassBuilding Class 
    * @method
    */
    public String getName() {return name;}
    public String getAddress() {return address;}
    public int getRooms() {return rooms;}

     /** SetFunctions
    * setFunctions to set data for user from bassBuilding Class 
    * @method
    */
    public void setName(String inputName) {name = inputName;}
    public void setAddress(String inputAddress) {address = inputAddress;}
    public void setRooms(int inputRooms) {rooms = inputRooms;}

    // Report the buildings stats
    public String displayBuidling() { return String.format("Building name: " + name + "\n\nAddress: " + address + "\n\nRooms: "+ rooms);}

    // Adding and removing vector functions.
    public abstract void addPersonToVector(bassPerson inputCityHallOccupant);
    public abstract void removePersonFromVector(bassPerson inputCityHallOccupant);

    // reading the occupants.
    public abstract void displayOccupants();
}
