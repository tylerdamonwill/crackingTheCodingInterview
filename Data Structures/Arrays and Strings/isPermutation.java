import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class isPermutation {
	
	static boolean isPermutation(String str1, String str2) { //off the dome O(n^2)
		if(str1.length() != str2.length()) {return false;}
		
		Boolean[] used = new Boolean[str1.length()];
		Arrays.fill(used, Boolean.FALSE);
		
		for(int i = 0; i < str1.length(); i++) {
			Boolean seen = false;
			for(int j = 0; j < str2.length(); j++) {
				if(!used[j] && str1.charAt(i) == str2.charAt(j) && !seen){
					used[j] = seen = true;
				}
			}
			if(!seen){return false;}
		}
		return true;
	}
	
	static boolean isPermutationGayle(String str1, String str2) { //from cracking the coding interview O(n)
		if(str1.length() != str2.length()) {return false;}
		
		int[] seen = new int[128];
		
		for(int i = 0; i < str1.length(); i++) {
			seen[str1.charAt(i)]++;
		}
		
		for(int i = 0; i < str2.length(); i++) {
			seen[str2.charAt(i)]--;
			if(seen[str2.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(isPermutationGayle("", "")); //true
		System.out.println(isPermutationGayle("Will", "lliW")); //true
		System.out.println(isPermutationGayle("sst", "tes")); //false
		System.out.println(isPermutationGayle("sst", "tss"));//true
		System.out.println(isPermutationGayle("    o", "  o  ")); //true
		System.out.println(isPermutationGayle("TtYy", ""));//false
		
	}
}

