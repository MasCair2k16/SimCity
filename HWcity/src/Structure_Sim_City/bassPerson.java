package Structure_Sim_City;

/**
 * This program demonstrates the bassPerson who is adult to police,teacher, and kid
 * @author Mason Caird
 * @since 1-8-18
 */

//import java.math.BigInteger;

public class bassPerson {

    // private functions.
    protected String name;
    protected Integer age;
    protected String cellNumber;

    /**
     * @return Default and Constructors are used to define a BassPerson()
     * 
     */
    // Default Constructor
    bassPerson() {
        name = "Mason Caird";
        age = 21;
        cellNumber = "(360)-880-5770";
    }

    // Constructor
    bassPerson(String name, int age, String cellNumber) {
        this.name = name;
        this.age = age;
        this.cellNumber = cellNumber;
    }

    // Get Functions...
    public String getName() {return name;}
    public Integer getAge() {return age;}
    public String getCellNumber() {return cellNumber;}

    // Set Functions...
    public void setName(String inputName) {name = inputName;}
    public void setAge(int inputAge) {age = inputAge;}
    public void setCellNumber(String inputCellNumber) {cellNumber = inputCellNumber;}

    // a standard way of displaying a person. No ID, no degree. just name, age, and cell number.b
    public String bassSummary() {
        return String.format("Person: " + name + "\nAge: " + age + "\nCell Number: " + cellNumber);
    }

    public String toDisplay() {return "0";}

}