// Computes the future value of a saving investment.

public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		double precentageRate = rate/100;
		int n = Integer.parseInt(args[2]); // Number of years
		// Calculates the future value.
		double futureValue = currentValue * Math.pow(1+precentageRate, n);
		String message = String.format("After %s years, $%s saved at %s%% will yield $%s", 
		n, currentValue, rate, (int) futureValue);
		System.out.println(message);
	}
}