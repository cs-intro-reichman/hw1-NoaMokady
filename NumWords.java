// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		// Finds the given number's hundreds, tens and ones.
		int hundreds = (int) (num / 100);
		int tens = (int) (num / 10) % 10;
		int ones = (int) (num % 10);
		String message = String.format("%s hundreds, %s tens, and %s ones.", 
		hundreds, tens, ones);
		System.out.println(message);
	}
}