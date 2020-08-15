import java.util.Scanner;
import java.io.*;

public class UserInputReader {

	public static void main(String[] args) {
		
		// Lewis University Programming Fundamentals Lab 5 Exercise 2
		// Brent Harshbarger
		
		FileWriter writer = null;
		Scanner reader = null;
		try {
			reader = new Scanner(System.in);
			writer = new FileWriter("userStrings.txt");

			System.out.println("Enter some strings line by line to capture to a file. Enter 'DONE' to stop and exit.");
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				if (line != null && line.equalsIgnoreCase("done")) {
					System.out.print("Done. Exiting...");
					break;
				} else {
					writer.write(line + "\n");
					writer.flush();
					System.out.println("Wrote \"" + line + "\" to output file.\n");
				}
			}
		} catch (Exception e) {
			System.out.println("Exception while capturing/processing user input: " + e.getMessage());
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (Exception ce) {
				// Do nothing
			}
		}

	}

}
