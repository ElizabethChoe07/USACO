package CodeQuest;
import java.util.*;
public class anagram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		
		for (int i = 1; i <= num; i++) {
			String str = in.nextLine();
			String[] input = str.split("|");
			
			char[] a = input[0].toCharArray();
			char[] b = input[0].toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if (!Arrays.equals(a,b) || input[0].equals(input[1])) {
				System.out.println(" = NOT AN ANAGRAM");
			}
			else {
				System.out.println(" = ANAGRAM");
			}

		}
	}

}
