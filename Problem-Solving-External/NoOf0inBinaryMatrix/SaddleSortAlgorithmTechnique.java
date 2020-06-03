package practice;

public class NoOf0InBinaryMatrix {

	public int getCount(int[][] nums) {
		int count = 0;

		// set row and col position at right most corner of the matrix
		int row = 0, col = nums[0].length - 1;

		// traverse until it reaches left-bottom corner
		while (row < nums.length && col >= 0) {
			// if the element found is 0 then all the elements left of it are
			// also 0, so add them into count
			if (nums[row][col] == 0) {
				count = count + col + 1;
				row++;

				// if ele = 1, then all elements bottom of it are also 1 so skip
				// that column
			} else if (nums[row][col] == 1) {
				col--;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

		NoOf0InBinaryMatrix obj = new NoOf0InBinaryMatrix();

		System.out.println("The count is " + obj.getCount(nums));
	}

}
