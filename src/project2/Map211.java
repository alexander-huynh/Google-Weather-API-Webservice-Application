/* Name: Alexander Huynh
 * Student ID: 202484621
 * Date: 2/1/23
 * Program Description: This class creates an HTML file using the weather data. This HTML file content opens and displays the weather data and map of city.
 *  This classes constructor takes the city's name, weather data, map type, and zoom as parameters for the HTML file.
 */

package project2;

import java.awt.Desktop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Map211 {
	
	static String html;
	static String mapFileName="myMap.html";
	 
	public Map211 (String cityName, String weatherInfo, String mapType, int zoom) throws IOException { // Constructor takes parameters

	    cityName= cityName.toUpperCase();
	    writeHTML(cityName, weatherInfo, mapType, zoom);
	    String url = mapFileName;   //myMap.html is created in the project folder
	    File htmlFile = new File(url);
	    Desktop.getDesktop().browse(htmlFile.toURI());
	}

	public static void writeHTML(String cityName, String weatherNow, String mapType, int zoom) { //Create HTML file using myWeatherApp parameters
		html="<!DOCTYPE html>"
		+ "<html>"
		+ "<body>"
		+ "<h2>"
		+ "["+ cityName+"] " + weatherNow
		+ "</h2>"
		+ "<iframe"
		+ "  width=1200"
		+ "  height=900"
		+ "  style=border:0"
		+ "  loading=lazy"
		+ "  allowfullscreen"
		+ "  referrerpolicy=\"no-referrer-when-downgrade\""
		+ "src=\"https://www.google.com/maps/embed/v1/place?key=AIzaSyBfKBE2y9_R_JcE76IFDFqDJwVsGKemmIM&q="+ cityName +"&zoom="+ zoom +"&maptype=" + mapType+"\""
		+ "</iframe>"            
		+ "</body>"
		+ "</html>";

		File f= new File (mapFileName);
		try {
		   BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		   bw.write(html);
		   bw.close();
		} catch (IOException e) {
		  e.printStackTrace();
		}
		}

}
