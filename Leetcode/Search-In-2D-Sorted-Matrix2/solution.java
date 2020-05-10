//THIS IS CAN BE USED TO SOLVE THE OTHER VARIANT OF THIS QUESTION ALSO.
//THE LOGIC USED IN THIS PROBLEM IS TO PLACE OUR INTIAL ARAY POSITION AT THE TOP-RIGHT CORNER OF THE MATRIX.

//SET BOUNDRIES FOR ROWS AND COLUMNS.
//IF THAT ELEMENT IS LESS THAN TARGET THAT MEANS ALL THE ELEMENTS IN THAT ROW ARE ALSO SMALLER THAN TARGET 
//SO REDUCE THE SEARCH SPACE BY REMOVING THE ROW BY MOVING DOWN. i.e ROW++
//IF THAT ELEMENT IS GREATER THAN TARGET IT MEANS ALL THE ELEMENTS IN THAT COLUMN ARE ALSO GREATER THAN THE TARGET.
//SO REDUCE THE SEARCH SPACE BY REMOVING THAT COLUMN BY GOING LEFT SIDE i.e COL--.

//THIS IS ALSO CALLED AS SADDLE-SORT ALGORITHM..



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length < 1 || matrix[0].length < 1) 
            return false;
        
        //Target checking not required , can be assumed that target is within range,
        //(target < matrix[0][0] || target > matrix[matrix.length-1][matrix[0].length-1]) 
        //eturn false;
    
        int row = 0;
        int col = matrix[0].length - 1;
        
        while(row < matrix.length && col >=0)
        {
            if(matrix[row][col] == target)
                return true;
            else if( matrix[row][col] > target )
                col--;
            else #if( matrix[row][col] < target )
                row++;
        }
        return false;
    }
}