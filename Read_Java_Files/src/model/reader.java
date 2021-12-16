package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reader {
	public static void main(String[] args) {

		File f = new File("textfile.txt");
		try {
			Scanner reader = new Scanner(f);
			while(reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		
	}
}
