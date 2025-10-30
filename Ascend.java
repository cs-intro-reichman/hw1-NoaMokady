// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		// Creates three random numbers between 0 to the given limit.
		int a = (int) (Math.random()*lim);
		int b = (int) (Math.random()*lim);
		int c = (int) (Math.random()*lim);
		// Prints the three random numbers by their original order.
		System.out.println(String.format("%s %s %s", a, b, c));
		// Finds the minimum, medium and maximum numbers.
		int minNum = Math.min(a, Math.min(b, c));
		int maxNum = Math.max(a, Math.max(b, c));
		int mediumNum = a + b + c - minNum - maxNum;
		// Prints the three random numbers by their ascending order.
		System.out.println(String.format("%s %s %s", minNum, mediumNum, maxNum)); 
	}
}
