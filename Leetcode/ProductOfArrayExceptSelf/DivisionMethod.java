package practice;

public class ProductOfArrayExceptSelf {

	public void getProductByDivision(int[] nums) {
		
		int total_product = 1;
		for(int i=0; i<nums.length; i++)
		{
			total_product = total_product*nums[i];
		}
		
		for(int i=0; i<nums.length; i++)
		{
			nums[i] = total_product / (i+1);
		}
		
		
		System.out.println("Product of array execpt self using Division");
		displayProduct(nums);
	}

    public void displayProduct(int []nums) {
		for (int ele : nums)
			System.out.print(ele + " ");
	}

	public static void main(String[] args) {

		ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();

		int nums[] = { 1, 2, 3, 4 };

		obj.getProductByDivision(nums);

	}
}
