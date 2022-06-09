package CodeQuest;
import java.util.*;
public class not_so_safe_driving {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = Integer.parseInt(in.nextLine());
		
		for (int i = 1; i <= num; i++) {
			String[] input = in.nextLine().split(" : ");
			Double[] values = {Double.parseDouble(input[0]), Double.parseDouble(input[1])};
			
			double ms = values[1]/values[0];
			
			if (ms <= 1) {
				System.out.println("SWERVE");
			}
			else if (ms<=5) {
				System.out.println("BRAKE");
			}
			else {
				System.out.println("SAFE");
			}
		}
		

	}

}
