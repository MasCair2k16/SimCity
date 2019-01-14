package Structure_Sim_City;

/**
 * This program demonstrates the class police who is a child of BassPerson
 * @author Mason Caird
 * @since 1-8-18
 */

public class police extends bassPerson implements employee {
	public enum policeRole {
	    Patrol, Sargent, Captain, Chief};

    
    policeRole role; 
    private int policePay = 540; // monthly pay
    private int ID; 
    private int bank = 0; // Balance in the bank

    //Default Constructor...
    public police () {
        role = policeRole.Patrol;
        
    }
    // Constructor
    public police(String inputName, int inputAge, String inputCellNumber, policeRole inputRole, int inputID) {
        name = inputName;
        age = inputAge;
        cellNumber = inputCellNumber;
        this.role = inputRole;
        this.ID = inputID;
    }
    // getFunctinos..
    public policeRole getRole() {return role;}
    public int getID() {return ID;} 

    // setfunctions for ID and role position
    public void enterID(int inputId) {ID = inputId;} // Implemented

    // Pay function to be called. This will also add money to bank
    public void givePay() { //implemented
        bank = bank + policePay;
        System.out.println("\nPolice Paid!");
    }

    // to display there pay // all implemented
    public String displayPay() { return String.format("Your pay: " + policePay);}
    public String displayEnterID() {return String.format("Enter your police ID: ");}
    public String displayBank() {return String.format("Bank Total: " + bank);}
    public String displayID() {return String.format("Your ID: " + ID);}

    // display police info
    public String toDisplay() { return String.format("Police name: " + name + "\n\nAge: " 
    + age + "\n\nCell Number: "+ cellNumber + "\n\nID Number: " + ID + "\n\nPosition: " + role );}

}