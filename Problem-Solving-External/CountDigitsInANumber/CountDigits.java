package practice;

public class CountDigits {

	public int countDigitsRecursively(long value) {

		if (value == 0)
			return 0;
		return 1 + countDigitsRecursively(value / 10);
	}

	public int countDigitsIteratively(long value) {

		int count = 0;
		while (value > 0) {
			count++;
			value /= 10;
		}
		return count;
	}
	
	public int countDigitsLogarithmic(long value) {
		int count = 0;
		return (count = (int) Math.floor(Math.log10(value) + 1));
	}
	

	public static void main(String[] args) {

		CountDigits obj = new CountDigits();
	    long value = 12345678;
		// Recursive
		System.out.println("The number of digits in Recursive Method " + value
				+ " are " + obj.countDigitsRecursively(value));
		// Iterative
		System.out.println("The number of digits in Iterative Method " + value
				+ " are " + obj.countDigitsIteratively(value));
		// Log10 method
		System.out.println("The number of digits in Logarithmic Method "
				+ value + " are " + obj.countDigitsLogarithmic(value));
		
	}

}
s