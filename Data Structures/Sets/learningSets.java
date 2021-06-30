import java.util.HashSet;
import java.util.Iterator;

public class learningSets {
	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		h.add("blue");
		h.add("orange");
		h.add("blue");
		h.add("red");
		
		//can't rely on order of HashSet when asking for data back
		
		Iterator<String> it = h.iterator(); //how to walk through a set
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
