package Structure_Sim_City;

/**
 * This program defines the city class, by itself.
 * I only define the name of the city in here. Nothing else.
 * @author Mason Caird
 * @since 1-8-18
 */

//import java.util.*;

public class city {
    
    private String cityName;
    
    // Name of the City. Default Constructor
    city() {
        cityName = "Dudesville";
    }

    // constructor
    city(String inputCityName) {
        cityName = inputCityName;
    }

    // getFunction
    public String getCityName() {return cityName;}
    
    // setFunction
    public void setCityName(String inputCityName) {cityName = inputCityName;}

}