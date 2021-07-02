import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class rotate {
	
	static boolean rotate(int[][] matrix){
		
		// still not too comfortable with this one
		// I have it memorized, but actually want to understand it more
		if(matrix.length == 0 || matrix.length != matrix[0].length) {return false;}
		
		int n = matrix.length;
		
		for(int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; //save top
				
				// left -> top
				matrix[first][i] = matrix[last-offset][first];
				
				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset];
				
				// right -> bottom
				matrix[last][last-offset] = matrix[i][last];
				
				// top -> right
				matrix[i][last] = top; //right <-saved top
				
			}
		}
		
		return true;
	}
		
	public static void main(String[] args) {
		System.out.println("Devote more time here buddy"); //a
	}
}

