package ds.intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaxInteger {
	public static int[] readNumbers(String path) throws FileNotFoundException {
		int[] numbers = new int[100];
		
		Scanner scanner = new Scanner(new File(path));
		
		int i = 0;
		
		while(scanner.hasNextLine()) {
			numbers[i] = scanner.nextInt();
			i++;
		}
		
		scanner.close();
		
		return numbers;
	}
	
	public static int findMax(int[] numbers){
		int max = numbers[0];
		
		for(int i = 1; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}
		}
		return max;	
	}
	
	public static void writeToFile(String path, int maxNum) throws IOException {
		File file = new File(path);
		FileWriter fw = new FileWriter(file);
		
		fw.write(Integer.toString(maxNum));
		fw.close();
	}
}
