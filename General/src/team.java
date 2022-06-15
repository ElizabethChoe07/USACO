import java.util.*;
public class team {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.nextLine());
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			String input = in.nextLine();
			
			int temp = 0;
			
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j)=='1') {
					temp ++;
				}
			}
			if (temp > 1) {
				sum ++;
			}
		}
		
		System.out.println(sum);

	}

}
