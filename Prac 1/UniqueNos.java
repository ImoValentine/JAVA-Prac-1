import java.util.ArrayList;
import java.util.Random;

public class UniqueNos {

	public static void generateUniqueList(int max, int num_vals) {
		ArrayList <Integer> unique_vals = new ArrayList<Integer>();
		Random r = new Random();
		while (unique_vals.size() < num_vals) {
			int val = r.nextInt(max);
			if (!unique_vals.contains(val)) {
				unique_vals.add(val);
			}
		}
		System.out.println(unique_vals.toString());
	}
		
	public static void main(String[] args) {
		generateUniqueList(20, 20);
	}
	
}
