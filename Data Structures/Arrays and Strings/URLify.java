import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class URLify {
	
	static char[] URLify(char[] unchanged) {
		if(unchanged[unchanged.length - 1] != ' ') {return unchanged;}
		
		int spaces = 0;
		int i  = unchanged.length - 1;
		
		while(unchanged[i] == ' ') {
			i--;
			spaces++;
		}
		
		while(i > -1 && spaces > 0) {
			if(unchanged[i] != ' ') {
				unchanged[i + spaces] = unchanged[i];
				unchanged[i] = ' ';
			} else {
				unchanged[i + spaces] = '0';
				unchanged[i + spaces - 1] = '2';
				unchanged[i + spaces - 2] = '%';
				spaces -= 2;
			}
			i--;
		}
		
		return unchanged;
	}
		
	public static void main(String[] args) {
		
		char[] test1 = {'m', 'y', ' ', 'd', 'o', 'g', ' ', ' '};
		char[] test2 = {'m', 'y', ' ', 'd', 'o', 'g', ' ', 'n', 'i', 'c', 'o', ' ', ' ', ' ', ' '};
		char[] test3 = {'m', 'y', ' ', 'd', 'o', 'g', ' ', 'n', 'i', 'c', 'o', ' ', 'a', ' ', ' ', ' ', ' ',' ', ' '};
		//char[] test3 = {' ', ' ', ' ', ' '};
		
		System.out.println("Test 1: " + String.valueOf(URLify(test1))); //
		System.out.println("Test 2: " + String.valueOf(URLify(test2))); //
		System.out.println("Test 3: " + String.valueOf(URLify(test3))); //
		
	}
}