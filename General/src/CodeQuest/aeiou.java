package CodeQuest;
import java.util.Scanner;

public class aeiou {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		
		for (int a = 1; a <=n ; a++) {
			String str = in.nextLine();
			char[] vowels = {'a', 'e', 'i', 'o', 'u'};
			
			int c = 0;
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < vowels.length; j++) {
					if (str.charAt(i) == vowels[j]) {
						c++;
					}
				}
			}
			
			System.out.println(c);
			
			
		}

	}

}
