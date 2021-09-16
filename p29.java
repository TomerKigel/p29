import java.util.*;

public class p29 {
		public static void main(String[] args) {
			Vector<Integer> Inputs = new Vector<Integer>();
			Vector<Integer> outputs = new Vector<Integer>();
			
			Inputs.add(5);
			outputs.add(15);
			
			
			Test(Inputs,outputs);
			System.out.println("Answer is: " + p29(100));
					
		}
		public static int p29(int bound)
		{
			int count = (bound-1)*(bound-1);
			TreeSet set = new  TreeSet();
			 
			for (int a = 2; a <= bound; a++) {
			    for (int b = 2; b <= bound; b++) {
			        double result = Math.pow(a, b);
			        set.add(result);
			     }
			 }
			return set.size();
		}
		
		public static void Test(Vector<Integer> Inputs,Vector<Integer> Excpected_Outputs)
		{
			int i = 1;
			for (Integer num : Inputs) {
				System.out.print("Test number" + i +":");
				if(p29(num) == Excpected_Outputs.elementAt(i-1))
					System.out.println("Passed");
				else
					System.out.println("Failed");
				i++;
			}
		}
}
