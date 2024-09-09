/* Name: Alexander Huynh
 * Student ID: 202484621
 * Date: 2/1/23
 * Program Description: This class uses an API to receive a given city's weather data. 
 * The API's data is stored into a JSON file, and the data keys and values are returned as a concatenated string.
 * 
 */

package project2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Weather211 {
	
	public static String CityWeather(String cityName) throws Exception {
		String cityweather = "";
		try {
			
			String firstPartURL = "https://api.openweathermap.org/data/2.5/weather?q=";
			String secondPartURL ="&appid=8e5c69652ea817e9990d82105a9e66eb"; 
			String theURL = firstPartURL + cityName + secondPartURL; // Concatenate string of API URL.


			URL url = new URL(theURL);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			JSONParser jsonParser = new JSONParser(); 
			JSONObject myObject = (JSONObject)jsonParser.parse(br);
			
			
			System.out.println("myObject: " + myObject);
			System.out.println("Key Set: " + myObject.keySet());
			System.out.println();
			
			
			// 1. weather description. Use JSONArray and JSONObject
			JSONArray weatherArray = (JSONArray)myObject.get("weather");
			JSONObject w = (JSONObject) weatherArray.get(0);
			String weatherNow = "Current Weather: " + (String) w.get("description");

			
			// 2. Temperature  
			double cityTemp = (double)((JSONObject) myObject.get("main")).get("temp"); 
			cityTemp = ((cityTemp - 273.15)*9)/5 + 32; //convert from kelvin to Fahrenheit;
			String cityTempString = ("Current Temperature: " + String.format("%.1f", cityTemp)+"\u00B0"+"F");

			
			// 3. Temp_min 
			double cityTempMin = (double)((JSONObject) myObject.get("main")).get("temp_min"); 
			cityTempMin = ((cityTempMin - 273.15)*9)/5 + 32; //convert from kelvin to Fahrenheit;
			String cityTempMinString = ("Low Temperature: " + String.format("%.1f", cityTempMin)+"\u00B0"+"F");
			
			// 4. Temp_max
			
			double cityTempMax = (double)((JSONObject) myObject.get("main")).get("temp_max"); 
			cityTempMax = ((cityTempMax - 273.15)*9)/5 + 32; //convert from kelvin to Fahrenheit;
			String cityTempMaxString = ("High Temperature: " + String.format("%.1f", cityTempMax)+"\u00B0"+"F");
			
			// 5. Wind Speed 

			String windSpeed = "Wind Speed: " + String.valueOf( (double)((JSONObject) myObject.get("wind")).get("speed") ) + "mph";
			
			// 6. Humidity  
			String humidity = "Humidity: " + String.valueOf( (long)((JSONObject) myObject.get("main")).get("humidity") ) + "%"; 

			// add current date and time
			
		    LocalDateTime dateObj = LocalDateTime.now();
		    DateTimeFormatter timeObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
		    String currentTime = dateObj.format(timeObj); 
			    
		    // Create a single string for the map (use the concept of string concatenation)
		    cityweather +=weatherNow + " | " + cityTempString + " | " + cityTempMinString + " | " + cityTempMaxString + " | " + windSpeed + " | " + humidity + " | " + currentTime + " | "; 
			   
		}
		
		catch (Exception ex) {
			//System.out.println(ex);
		}
		
		return cityweather;
	}
	
	
	
	
	
	
	
}
