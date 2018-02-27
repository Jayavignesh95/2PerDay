package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloydTriangle {
   public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of lines");
	Integer line = Integer.parseInt(br.readLine());
	int num=1;
	for (int i = 1; i <= line; i++) {
		for (int j = 1; j <= i; j++) {
     		System.out.print(num+"   ");
     		num++;
		}
		System.out.println();
	}
	
}
}
