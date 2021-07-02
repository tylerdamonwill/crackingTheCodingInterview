import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class compression {
	
	static String compression(String str){
		if(str.length() < 2) {return str;}
		
		str = str.toLowerCase();
		String compressed = "";
		
		char lastNew = str.charAt(0);
		int lastNewCount = 1;
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) != lastNew) {
				if(compressed.length() >= str.length()) {return str;}
				compressed += lastNew + Integer.toString(lastNewCount);
				lastNew = str.charAt(i);
				lastNewCount = 1;
			} else {
				lastNewCount++;
			}
		}
		
		compressed += lastNew + Integer.toString(lastNewCount);
		if(compressed.length() >= str.length()) {return str;}
		
		return String.valueOf(compressed);
	}
		
	public static void main(String[] args) {

		
		System.out.println("Test 1: " + compression("a")); //a
		System.out.println("Test 2: " + compression("aaaaaaabbbbcccc")); // a7b4c4
		System.out.println("Test 3: " + compression("pppppppppppppeeeee")); // p13e1
		System.out.println("Test 4: " + compression("abcdefg")); // abcdefg
		System.out.println("Test 4: " + compression("abgg")); // abgg
		System.out.println("Test 5: " + compression("aabbgg")); // aabbgg
		System.out.println("Test 6: " + compression("aabbggg")); // a1b2g3
	}
}

