package practice;

public class BouncyDigits {
	// A number is said to be bouncy if and only if, it has both increasing and
	// decreasing sequence present.

	// Recursively count number of digits
	public int countDigits(long value) {
		if (value == 0)
			return 0;
		return 1 + countDigits(value / 10);
	}

	// Check for conditions single digit, only increasing sequence or only
	// decreasing sequence, these conditions return false for bouncy digit.
	public boolean isBouncy(long value) {

		int len = countDigits(value);
		boolean isOnlyAsc = true, isOnlyDes = true;

		int val_array[] = new int[len];

		if (len == 0 || len == 1)
			return false;
		else {
			int a[] = new int[len];
			for (int i = 0; i < len; i++) {
				a[i] = (int) value % 10;
				value /= 10;
			}

			for (int i = len - 2; i >= 0; i--) {
				if (a[i] > a[i + 1])
					isOnlyAsc = false;
			    if (a[i] < a[i + 1])
					isOnlyDes = false;
			}

		}

		return (isOnlyAsc == false && isOnlyDes == false);

	}

	public static void main(String[] args) {

		BouncyDigits obj = new BouncyDigits();
		
		//bouncy
		long value = 1231;
		
		//not bouncy
		//long value = 1; //11; //123; //321;

		System.out.println("Is the given value a Bouncy Digit? : "
				+ obj.isBouncy(value));
	}

}
