import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;
import static java.util.Comparator.*;

public class Maximum {

	public static void main(String[] args) throws IOException {
		// Lewis University - Programming Fundamentals Lab 5 Exercise 1
		// Brent Harshbarger
	
			// File object
			File f = new File("input.csv");

			// Create array with ArrayList
			ArrayList<Integer> maxValues = new ArrayList<Integer>();

			// Set up BufferedReader to input data from file
			BufferedReader reader = new BufferedReader(new FileReader(f));

			// Read file into program
			while (reader.ready()) {
				String line = reader.readLine();

				// Stream data into the array and process it to determine the maxValues in each
				// row
				String[] values = line.split(",");
				Optional<String> maxStr = Stream.of(values)
						.max(comparingInt(String::length).thenComparing(naturalOrder()));

				// Convert string to to integer
				int maxInt = Integer.parseInt(maxStr.get());
				maxValues.add(maxInt);
			}
	
			reader.close();
	
		
		// Print output of ROW and highest value to screen
			System.out.println("Maximum Values");
		for (int i = 0; i < maxValues.size(); i++) {
			System.out.println("ROW " + Integer.toString(i + 1) + ": " + maxValues.get(i));
		}

	}

}
