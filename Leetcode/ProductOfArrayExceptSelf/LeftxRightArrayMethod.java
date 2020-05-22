package practice;

public class ProductOfArrayExceptSelf {

	public void getProductByDivision(int[] nums) {

		int total_product = 1;
		for (int i = 0; i < nums.length; i++) {
			total_product = total_product * nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = total_product / (i + 1);
		}

		System.out.println("Product of array execpt self using Division");
		displayProduct(nums);
	}

	public void getProductByLRmethod(int[] nums) {

		// This array keeps track of product of all elements left of it at index
		// i.
		int[] left_products = new int[nums.length];

		// This array keeps track of product of all elements right of it at
		// index i.
		int[] right_products = new int[nums.length];

		// Initialize left_products[0] = 1 since at index 0 no elements are
		// present to keep track of product of all elements left of it
		left_products[0] = 1;
		
		//From index 1, keep track of the product of all elements left of index i.
		for(int i=1; i<left_products.length; i++)
		{
			left_products[i] = nums[i-1]*left_products[i-1];
			System.out.println(left_products[i] + " ");
		}
		
		// Initialize right_products[N-1] = 1 since at index N-1 no elements are
		// present to keep track of product of all elements right of it
		right_products[nums.length - 1] = 1;
		
		//From index N-1, keep track of the product of all elements right of index i.
		for(int i=right_products.length - 2; i>=0; i--)
		{
			right_products[i] = nums[i+1] * right_products[i+1];
		}
		
		//Final Answer is given by multiplying these two arrays.
		for(int i=0; i<nums.length; i++)
		{
			//Storing result array in left_product
			left_products[i] = left_products[i] * right_products[i];
		}
		

		System.out
				.println("Product of array execpt self without using Division O(N) Time and Space");
		displayProduct(left_products);
	}

	public void displayProduct(int[] nums) {
		for (int ele : nums)
			System.out.print(ele + " ");
	}

	public static void main(String[] args) {

		ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();

		int nums[] = { 1, 2, 3, 4 };

		//obj.getProductByDivision(nums);
		obj.getProductByLRmethod(nums);

	}
}
