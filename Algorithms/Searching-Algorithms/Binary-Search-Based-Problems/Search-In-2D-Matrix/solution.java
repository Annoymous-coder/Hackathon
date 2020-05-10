//USING BINARY - SEARCH ALOGORITHM SINCE THE MATRIX IS SORTED.

//This problem is from Leetcode named Search in sorted 2D Matrix 1.The other method of saddlsort method is present in leetcode folder and external-problem folder.


//THE LOGIC IS TO START TREATING THE MATRIX AS A ARRAY SINCE THE RELATIONSHIPS OF THE ROWS ARE PRESERVED.
//Meaning the numbers are in sequence.
//USING THIS CONDITIONS ,
//FIND THE NUMBER OF ROWS BY matrix.length;
//FIND THE NUMBER OF COLS BY matrix[0].length;
//FIND THE TOTAL NUMBER OF ELEMENTS IN MATRIX , WE REQUIRE THIS NUMBER TO ASSIGN TO END POINTER , GENERALLY IN 1D WE GET IT BY matrix.length BUT SINCE THIS IS 2D ,
//DO IT BY no_of_rows * no_cols - 1. THE -1 IS AS THE SAME REASON WE DO IN 1D BS BY ASSIGNING END AS LEN - 1. WE START FROM 0 i.e -1.

//CORNER CASES ARE THAT 
//ARRAY IS EMPTY
//IT IS ONLY 1D MEANING NO COLS matrix[0].length = 0.
//THE GIVEN TARGET IS NOT PRESENT IN THE MATRIX.


package Algorithms;
class Search2DMatrix {
public boolean searchMatrix(int[][] matrix, int target) {
	
    if(matrix.length == 0 || matrix[0].length == 0) 
        return false;
    if(target < matrix[0][0] || target > matrix[matrix.length-1][matrix[0].length-1]) 
        return false;
    
	int row_num = matrix.length;
	int col_num = matrix[0].length;
	
	int begin = 0, end = row_num * col_num - 1;
	
	while(begin <= end){
		
		//Avoid numeric overflows
		int mid =  begin + (end - begin) / 2;
		
		//Formula: 
		//Since the mid_value is based of 1D array representation , we should find that mid element in 2D matrix.
		//When you have a index of a number to be found , then the index/no_of_col gives the row position of the required number.
		//The index%no_of_col gives the col position of the required number.
		int mid_value = matrix[mid/col_num][mid%col_num];
		
		if( mid_value == target){
			return true;
		
		}else if(mid_value < target){
			//Should move a bit further, otherwise dead loop.
			begin = mid+1;
		}else {
			//
			end = mid-1;
		}
	}
	
	return false;
}
	public static void main(String args[])
	{
		int matrix[][] = {
					  { 1,  3,  5,  7},
					  {10, 11, 16, 20},
					  {23, 30, 34, 50}
				   };
		
		int target = 3;
		
		Search2DMatrix obj = new Search2DMatrix();
		
		boolean isPresent = obj.searchMatrix(matrix , target);
		
		System.out.println(isPresent);
	}
}