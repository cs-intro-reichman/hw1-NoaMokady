// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		String message = String.format("%s hundreds, %s tens, and %s ones.", 
		(int) (num / 100) % 10, (int) (num / 10) % 10, (int) (num % 10));
		System.out.println(message);
	}
}