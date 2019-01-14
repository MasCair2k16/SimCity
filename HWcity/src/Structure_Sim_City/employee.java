package Structure_Sim_City;

/**
 * This program demonstrates the the interface of police and Teacher. 
 * This will give the police and teacher their pay, ID, DisplayBank.
 * @author Mason Caird
 * @since 1-8-18
 */

//import java.io.*; 

interface employee 
{
	// Method to give pay to worker. A will be the paycheck and C is the bank
	void givePay();
	  
	// Method to ask the user to enter ID.
  	void enterID(int b);
	
  // public and abstract 
	String displayEnterID(); 
	String displayPay();
	String displayBank();
	String displayID();
	  
} 