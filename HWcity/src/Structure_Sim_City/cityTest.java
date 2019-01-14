package Structure_Sim_City;

/**
 * This program demonstrates the mechanics of a game of a Sim City.
 * @author Mason Caird
 * @version Final Draft of HW2
 * @since 1-8-18
 */

public class cityTest {
    public static void main(String[] args) {

        // a list of buildings
    buildingBass [] cityBuildings = { 
        new cityHall("Dudesville City Hall", "911 Emergency Stop rd", 12), new school("Dudesville Public High School", "123 Eyes On Me blvd", 23)};
    
        // a list of occupants
    bassPerson [] population = {
//        new police("Jonny Boy", 45, "(345)-523-9614", policeRole.Patrol, 96234), new police("Will Smith", 48, "(360)-253-4112", policeRole.Sargent, 14231), 
//        new police("Kevin Hart", 34, "(509)-234-1421", policeRole.Captain, 14123), new police("Luke Bryan", 23, "(509)-212-1523", policeRole.Patrol, 12323), 
//        new police("Casey Sweet", 43, "(413)-253-2513", policeRole.Chief, 11973), new police("Duke Hazard", 23, "(142)-257-1243", policeRole.Patrol, 14235), 
//        new police("Charlie Brown", 78, "(509)-968-8890", policeRole.Patrol, 11321), new teacher("Bill Nye", 67, "(523)-123-1236", 9, "High School Diploma", 98756),
//        new teacher("Kent Jones", 51, "(509)-142-3945", 12, "PHd Computer Science",96575), new teacher("Scott Grifith", 26, "(142)-456-7931", 11, "Masters Network Systems",77986),  
        new teacher("Anakin Skywalker", 87, "(232)-234-1112", 10, "PHd Health Science",49846), new teacher("Yoda", 300, "(509)-234-9899", 11, "Masters in Pyschology",12234),
        new kid("Kyle Shepard", 19, "(587)-476-3478", "Boogers", 12), new kid("Giligan ISland", 15, "(857)-789-9874", "Snickers", 0), 
        new kid("Rex", 15, "(509)-127-5123", "Starbursts", 0), new kid("Luke Skywalker", 16, "(512)-123-4817", "Reeses", 5), new teacher("Martha Stewart", 67, "(509)-233-2534", 7, "BA in Culinary",79844),
        new teacher("Pete Tucker", 37, "(509)-978-7546", 12, "DR in Computer Science",69868), new teacher("Elon Musk", 43, "(509)-978-5386", 9, "BS Rocket Science",11357), 
        new teacher("Conway Twitty", 56, "(509)-974-2685", 11, "AA in Music",54683), new kid("Johnny Doe", 15, "(509)-867-9647", "Kit Kat", 13), 
        new kid("Mason Caird", 17, "(868)-856-8576", "Crunch", 3), new kid("Chad Lagoo", 16, "(587)-857-2347", "Smarties", 6), 
        new kid("Daniel Tucker", 20, "(509)-954-3354", "Coca-Cola", 42), new kid("Mark Zuckerberg",16, "(857)-856-1783", "Veggie Straws", 0), new kid("Ty Warner", 19, "(509)-981-2224","Kit Kats", 12)};

        // print city Buildings in a loop
        for (int i = 0; i < cityBuildings.length; i++ ) {
            System.out.println("\nBuildings: ");
            System.out.println(cityBuildings[i].displayBuidling());
        }

        // print people in a loop
        for (int i = 0; i < population.length; i++ ) {
            System.out.println("\nPerson: ");
            System.out.println(population[i].toDisplay());
        }

        // For these next two for loops, I know I can make it into one loop using classes verification in a if else statement.
        // city hall is 0 in Citybuildings so im adding the police population to that building.
        for (int i = 0; i < 7; i++) {
            cityBuildings[0].addPersonToVector(population[i]);
        }

        // school is 1 in CityBuildings so Im adding the kids and teachers to that building.
//        for (int i = 0; i < 17; i++) {
//            cityBuildings[1].addPersonToVector(population[i]);
//        }

        // Display the occupants in different buildings
        cityBuildings[0].displayOccupants();
        cityBuildings[1].displayOccupants();

        // if population is an instance of employee, then population who is employee give pay.
        for (int i = 0; i < population.length; i++) {
            if (population[i] instanceof employee) {
                ((employee)population[i]).givePay();
                System.out.printf(((employee)population[i]).displayPay());
            } else {System.out.println("\nYour not an employee");}
        }
    }
}