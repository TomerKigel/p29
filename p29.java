import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class p29 {

	
	
		public static void main(String[] args) {
			int count = 99*99;
			TreeSet set = new  TreeSet();
			 
			for (int a = 2; a <= 100; a++) {
			    for (int b = 2; b <= 100; b++) {
			    	if(a == 99 & b == 99)
			    		System.out.println();
			        double result = Math.pow(a, b);
			        set.add(result);
			     }
			 }
			System.out.println(set.size());
	}
}
