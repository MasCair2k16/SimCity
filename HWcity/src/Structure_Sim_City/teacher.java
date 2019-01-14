package Structure_Sim_City;

/**
 * This program demonstrates teacher which is child to bassPerson.java
 * @author Mason Caird
 * @since 1-8-18
 */

//import java.io.*;

public class teacher extends bassPerson implements employee {

    private int gradeLevel; //grade level
    private String degree;
    private int teacherPay = 450; // monthly pay
    private int ID; 
    private int bank = 0; // Balance in the bank

    // Default Constructor...
    teacher() {
        name = "Lily Ponder";
        age = 45;
        cellNumber = "(360)-857-8576";
        gradeLevel = 3;
        degree = "BS in Elementary Education";
    }

    // Constructor...
    public teacher(String inputName, int inputAge, String inputCellNumber, int inputGradeLevel, String inputDegree, int inputID) {
        name = inputName;
        age = inputAge;
        cellNumber = inputCellNumber;
        this.gradeLevel = inputGradeLevel;
        this.degree = inputDegree;
        this.ID = inputID;
    }

    // GetFunctions...
    public int getGradeLevel() {return gradeLevel;}
    public String getDegree() {return degree;}
    public int getID() {return ID;} // Implemented

    // SetFucnctions
    public void enterID(int inputId) {ID = inputId;} // Implemented
    public void setGradeLevel(int inputGradeLevel) {gradeLevel = inputGradeLevel;}
    public void setDegree(String inputDegree) {degree = inputDegree;}

    // giving the pay to the teacher
    public void givePay() {
        bank = bank + teacherPay;
        System.out.println("\nTeacher Paid!");
    }

    //Summaries to 
    public String displayPay() { return String.format("Your pay: " + teacherPay);}
    public String displayEnterID() {return String.format("Enter your teacher ID: ");}
    public String displayBank() {return String.format("Bank Total: " + bank);}
    public String displayID() {return String.format("Your ID: " + ID);}

    // Sumarrized teacher info
    public String toDisplay() { return String.format("Teacher name: " + name + "\n\nAge: " + age + "\n\nCell Number: "+ cellNumber + "\n\nID Number: " + ID + "\n\nGrade Level: " + gradeLevel + "\n\nDegree: " + degree);}
}