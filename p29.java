public class p29 {
		public static void main(String[] args) {
			int count = 99*99;
			Vector<Integer> Inputs = new Vector<Integer>();
			Vector<Integer> outputs = new Vector<Integer>();

			Inputs.add(10);
			outputs.add(88);

			Inputs.add(20);
			outputs.add(361);

			Inputs.add(30);
			outputs.add(814);

			Inputs.add(40);
			outputs.add(1444);

			Inputs.add(50);
			outputs.add(2279);

			Inputs.add(60);
			outputs.add(3335);

			Test(Inputs,outputs);
			System.out.println("Answer is: " + p29(99));

		}
		public static int p29(int bound)
		{
			int count = bound*bound;
			TreeSet set = new  TreeSet();

			for (int a = 2; a <= 100; a++) {
			    for (int b = 2; b <= 100; b++) {
			    	if(a == 99 & b == 99)
			    		System.out.println();
			for (int a = 2; a <= bound+1; a++) {
			    for (int b = 2; b <= bound+1; b++) {
			        double result = Math.pow(a, b);
			        set.add(result);
			     }
			 }
			System.out.println(set.size());
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
