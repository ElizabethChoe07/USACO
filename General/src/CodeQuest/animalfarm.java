package CodeQuest;
import java.util.Arrays;
import java.util.Scanner;

public class animalfarm {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		
		for (int i = 1; i <= num; i++) {
			String[] input = in.nextLine().split(" ");
			
			int sum = 0;
			sum += Integer.parseInt(input[0])*2 + Integer.parseInt(input[1])*4 + Integer.parseInt(input[2])*4;
			
			System.out.println(sum);
		}
	}

}
