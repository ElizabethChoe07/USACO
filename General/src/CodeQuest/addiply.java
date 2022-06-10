package CodeQuest;
import java.util.*;
public class addiply {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		
		for (int i = 1; i <=n ; i++) {
			String[] input = in.nextLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			String temp = "";
			temp += (a+b) + " " + (a*b);
			
			System.out.println(temp);
		}
	}

}
