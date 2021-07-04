import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class isRotation {
	
	static boolean isRotation(String str1, String str2) {
		if(str1.length() != str2.length()) {return false;}
		String dubStr1 = str1 + str1;
		return dubStr1.contains(str2);
	}

	public static void main(String[] args) {
		System.out.println("Test 1: " + isRotation("Test", "estT"));//True
		System.out.println("Test 2: " + isRotation("Test", "estt"));//False
		System.out.println("Test 3: " + isRotation("est", "estT"));//False
		System.out.println("Test 1: " + isRotation("  est  ", "    est"));//True
	}
}
