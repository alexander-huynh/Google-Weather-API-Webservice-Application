/* Name: Alexander Huynh
 * Student ID: 202484621
 * Date: 2/1/23
 * Program Description: The entire program outputs city weather data and a city map. 
 * This class is the main method; it calls the Weather211 class with the user's input as a parameter.
 * 
 */

package project2;
import java.util.Scanner;


public class myWeatherApp {
	
	static Scanner input = new Scanner(System.in);
	static String mapType;
	static int zoom;
	static String cityName;
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Welcome to the weather app for CS 211. \n");
		
		getCityWeather();
		
	}
	
	public static void getCityWeather() throws Exception{    
		   while (true) {     
			   
			   System.out.println("Enter city name: "); // Ask user for a city
			   cityName = input.nextLine();   
		   
			   //call Weather211 to get the weather data for the city
			   String cityWeather = Weather211.CityWeather(cityName); 
			     
			   if (cityWeather!="") {   // Run statements if the cityWeather string had a value in it.
				   
				   System.out.println("\nCity name: " + cityName + "\n" + cityWeather);
				   
				   mapSelection(); 
			      
			      //call Map211 to draw a map
			      new Map211(cityName, cityWeather, mapType, zoom);   
			       
			      break;
			    
			    } else { // empty data received
			        System.out.println("Invalid city name. Type again.\n"); 
			    }     
			   }
		 } 
	
	public static void mapSelection() throws Exception { // This method asks user for map type and zoom level.

		  System.out.println("\nSelect map type:  1) roadmap  2) satellite");
	      mapType = input.next();
	      
	      if (mapType.equals("1")) {
	    	  mapType = "roadmap";
	      } else if (mapType.equals("2")){
	    	  mapType = "satellite";
	      }

	      System.out.println("\nSelect zoom level of the map: 0 ~ 21");
	      zoom = input.nextInt();
		
	}

}
