package dailyTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckSquare {
	private static boolean check(int number){
        int sq = 1;
        while(number >= sq){
            if(number == sq){
                return true;
            }
            sq = sq*2;
        }
        return false;
    }
     public static void main(String[] args) throws NumberFormatException, IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number");
	int in =  Integer.parseInt(br.readLine());
	System.out.println("Is "+in+ " Square  : "+CheckSquare.check(in));
	
}
}
