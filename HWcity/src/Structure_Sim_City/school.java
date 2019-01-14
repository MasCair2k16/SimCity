package Structure_Sim_City;

/**


 * This program defines the school class and is the child class of BuildingBass.
 * This also hold a vector schoolOccupants to determine the occupants.
 * @author Mason Caird
 * @since 1-8-18
 */

import java.util.*;

public class school extends buildingBass {

    // Default Constructor...
    school() {
        name = "High School of Spokane";
        address = "666 Sunrise of Death st, Spokane, Washington";
        rooms = 20;
    }
    
    //not to sure if I need any of the stuff below but I made it just in case
    //Constructor...
    public school (String inputName, String inputAddress, int inputRooms) {
        name = inputName;
        address = inputAddress;
        rooms = inputRooms;
    }

    //school occupant vector that holds all the occupants and can be used to show whos in school.
    Vector<bassPerson> schoolOccupants = new Vector<bassPerson>();

    // Add a school Occupant // Defined in buildingBass
    public void addPersonToVector(bassPerson inputSchoolOccupant) {
        schoolOccupants.addElement(inputSchoolOccupant);
    }

    // Removes a hall occupant // defined in buildingBass
    public void removePersonFromVector(bassPerson inputSchoolOccupant) {
        schoolOccupants.remove(inputSchoolOccupant);
        schoolOccupants.trimToSize();
    }

    public void displayOccupants() {
        for(int i = 0; i < schoolOccupants.size(); i++) {
            System.out.println("\nSchool Occupants: " + schoolOccupants.elementAt(i).getName());
        }
    }


}