// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random()*lim);
		int b = (int) (Math.random()*lim);
		int c = (int) (Math.random()*lim);
		System.out.println(String.format("%s %s %s", a, b, c));
		int minNum = Math.min(a, Math.min(b, c));
		int maxNum = Math.max(a, Math.max(b, c));
		int mediumNum = a + b + c - minNum - maxNum;
		System.out.println(String.format("%s %s %s", minNum, mediumNum, maxNum));
	}
}
