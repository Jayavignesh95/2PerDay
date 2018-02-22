import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StackTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader scan= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many names would you like to enter?");
		int n = Integer.parseInt(scan.readLine());
		System.out.println("Enter the " + n + " names: ");
		String[] names = new String[n];
		for (int i = 0; i < names.length; i = i + 1) {
			names[i] = scan.readLine();
			System.out.println(i);
		}
		List<String> AllNames;
		// Prints the names in a list
		AllNames = new ArrayList<>(Arrays.asList(names));
		for (int i = 0; i < names.length; i = i + 2) {
			System.out.print(names[i]);
			if (i < names.length) {
				System.out.print(" " + "&" + " " + names[i + 1]);
			}
			System.out.println();
		}
		Random rand = new Random();
		Collections.shuffle(AllNames, rand);
		scan.close();
	}
}
