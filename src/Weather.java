
/*
 * Name: Justin Peng
 * Section Leader: Katherine Erdman
 * Takes inputted temperatures from the user until a sentinel value is reached and returns information 
 * about the numbers inputted such as average, highest temperature, lowest temperature, and the amound of days 
 * at or below 50 degrees.
 */
import acm.program.*;

public class Weather extends ConsoleProgram {
	private static final int SENTINEL_VALUE = -1;
	public void run() {
		println("CS 106A \"Weather Master 4000\"!");
		int temperature = readInt("Next Temerpature (or " + SENTINEL_VALUE +  " to quit)? ");
		int temperatureSum = 0;
		int iterations = 0;
		int highestTemperature = temperature;
		int lowestTemperature = temperature;
		int coldDays = 0;
		/*
		 * Compares the most recently inputted temperatures with the current highest and lowest temperatures
		 * and replaces the highest or lowest temperature variable with which ever tested as the best contendor.
		 * Also, it counts the amount of temperatures below 50 degrees, the amount of temperatures entered, and the total temperature sum.
		 */
		while(temperature != SENTINEL_VALUE) {
			if(temperature <= 50) {
				coldDays = coldDays+1;
			}
			temperatureSum = temperatureSum + temperature; 
			iterations = iterations+1;
			if(temperature > highestTemperature) {
				highestTemperature = temperature;
			}
			if(temperature < lowestTemperature) {
				lowestTemperature = temperature;
			}	
			temperature = readInt("Next Temperature (or " + SENTINEL_VALUE +  " to quit)? ");
		}	
		/*
		 * Prints out all of the information to the user.
		 */
		if(temperature == SENTINEL_VALUE && iterations == 0) {
			println("No temperatures were entered.");
		} else {
			
			println("Lowest temperature = " + lowestTemperature);
			println("Highest temperature = " + highestTemperature);
			double averageTemperature = temperatureSum/iterations; 
			println("Average = " + averageTemperature);
			println(coldDays + " cold days(s).");
		}	
	}
}
