package CodeQuest;
import java.util.*;
public class asteroid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		
		for (int a = 1; a <= n; a++) {
			int A = Integer.parseInt(in.nextLine());
			
			HashMap<String, String> d = new HashMap<String, String>();
			
			for (int i = 1; i <= A; i++) {
				String temp = in.nextLine();
				String[] temp1 = temp.split(" ");
				int x = Integer.parseInt(temp1[0]);
				int y = Integer.parseInt(temp1[1]);
				
				Double di = Math.sqrt((Math.pow(x, 2) + (Math.pow(y,2))));
				d.put(String.valueOf(di), temp);
				
			}
			
			ArrayList<String> dis = new ArrayList<String>();
			for (String key : d.keySet()) {
				dis.add(key);
			}
			Array
			for (int i = 0; i )
		}

	}

}
