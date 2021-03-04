package ds.intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Reading the numbers...");
		int[] numbers = MaxInteger.readNumbers("D:\\Burch University\\2. year\\Semester 2\\Data Structures\\WORKSPACE\\week1-intro\\src\\ds\\intro\\numbers.txt");
		
		int maxNumber = MaxInteger.findMax(numbers);
		
		System.out.println("The max number is: " + maxNumber);
		
		MaxInteger.writeToFile("D:\\\\Burch University\\\\2. year\\\\Semester 2\\\\Data Structures\\\\WORKSPACE\\\\week1-intro\\\\src\\\\ds\\\\intro\\\\solution.txt", maxNumber);
	}

}
