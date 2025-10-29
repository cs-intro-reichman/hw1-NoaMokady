// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	// Returns a message with the split bill.
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double bill = Integer.parseInt(args[3]);
		double splitBill = Math.ceil(bill/3);
		String message = String.format("Dear %s, %s, and %s: pay %s Shekels each.", 
		name3, name2, name1, splitBill);
	    System.out.println(message);
	}
}