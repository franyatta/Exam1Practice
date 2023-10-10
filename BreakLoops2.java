
public class BreakLoops2 {

	public static void main(String[] args) {
		
		int n = 36;
		int factor = 2;
		while (factor <= n) {
			if (n % factor == 0)
				break;
			factor++;
		}
		System.out.println(
				"the smaller factor other than 1 for " + n + " is " + factor);
	}

}
