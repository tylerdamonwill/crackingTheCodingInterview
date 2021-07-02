import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class oneAway {
	
	static boolean oneAway(String str1, String str2){
		if(oneAwayHelp(str1, str2, 0) > 1) { return false; }
		return true;
	}
	
	static int oneAwayHelp(String str1, String str2, int changes){
		if(changes > 1) {return Integer.MAX_VALUE;}
		if(str1.equals(str2)) {
			return 0;
		}
		
		String smallest = str1, biggest = str2;
		if( (smallest.length() - biggest.length()) > 0 &&
			(Math.abs(smallest.length() - biggest.length()) < 2)) {
			smallest = str2;
			biggest = str1;
		}
		
		for(int i = 0; i < smallest.length(); i++) {
			if(smallest.charAt(i) != biggest.charAt(i)) {
				String inserted = biggest.charAt(i) + smallest.substring(i);
				String removed = biggest.substring(i + 1);
				String replaced = smallest.charAt(i) + biggest.substring(i + 1);
				return Math.min(oneAwayHelp(inserted, biggest.substring(i), changes + 1) ,
					   Math.min(oneAwayHelp(smallest.substring(i), removed, changes + 1),
							    oneAwayHelp(smallest, replaced, changes + 1)));
			}
		}
		return 0;
	}
		
	public static void main(String[] args) {

		
		System.out.println("Test 1: " + String.valueOf(oneAway("pale", "bale"))); //true
		System.out.println("Test 2: " + String.valueOf(oneAway("pale", "bake"))); //false
		System.out.println("Test 3: " + String.valueOf(oneAway("pale", "pal"))); //true
	}
}

