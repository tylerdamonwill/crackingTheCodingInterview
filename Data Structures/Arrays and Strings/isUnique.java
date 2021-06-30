import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class isUnique {
	
	static boolean isUnique(String str) {//with HashMap
		boolean[] bools = new boolean[128];
		
		if(str.length() > 128) {return false;}
		
		for(int i = 0; i < str.length(); i++) {
			int curChar = str.charAt(i);
			if(bools[curChar]){return false;}
			bools[curChar] = true;
		}
		
		return true;
	}
	
	//if you counldn't use a data structure to store past elements, you could sort
	// char[] sorted = str.toCharArray();
	// Array.sort(sorted);
	// str = String(sorted);
		
	public static void main(String[] args) {
		
		System.out.println(isUnique(""));
		System.out.println(isUnique("Williams"));
		System.out.println(isUnique("Tyler103"));
		System.out.println(isUnique("Tyler1033"));
		System.out.println(isUnique("   ˇrlt mr vd"));
		System.out.println(isUnique("TtYy"));
		
	}
}

