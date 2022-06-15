import java.util.*;
public class soldier {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String[] input = in.nextLine().split(" ");
		
		int k = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);
		int w = Integer.parseInt(input[2]);
		
		int ans = k*((w*(w+1))/2);
		ans -= n;
		if (ans<= 0) {
			System.out.println("0");
		}
		else {
			System.out.println(ans);
		}

	}

}
