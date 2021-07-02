import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class isPalPer {
	
	static boolean isPalPer(String test){
		test = test.toLowerCase();
		int[] seen = new int[26];
		int odds = 0;
		
		for(int i = 0; i < test.length(); i++) {
			int temp = test.charAt(i) - 97;
			if(temp > -1 && temp < 26) {
				seen[temp]++;
				if((seen[temp] % 2) > 0){
					odds++;
				} else {
					odds--;
				}
			}
		}
		
		if(odds > 1) {return false;}
		
		return true;
	}
		
	public static void main(String[] args) {
		
		String test1 = "Tact coa"; // True
		String test2 = "ttaatt       34535"; // True
		String test3 = "  oO   iittiiroo p P 2134 "; // True
		String test4 = "  oo Dfss rr "; // False
		
		System.out.println("Test 1: " + String.valueOf(isPalPer(test1)));
		System.out.println("Test 2: " + String.valueOf(isPalPer(test2)));
		System.out.println("Test 3: " + String.valueOf(isPalPer(test3)));
		System.out.println("Test 4: " + String.valueOf(isPalPer(test4)));
	}
}

