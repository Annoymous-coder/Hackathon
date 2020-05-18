class Solution {
    public int findDuplicate(int[] arr) {
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[Math.abs(arr[i])-1] < 0)
            {
                return Math.abs(arr[i]);
            }
            else {
                arr[Math.abs(arr[i]) -1] = - arr[Math.abs(arr[i]) -1];
            }
        }
        throw new IllegalArgumentException("No Duplia=cate Found");
    }
}
//abs() is used in cases like these [2,1,3,5,3,2] where after the first iteration we will have [2,-1,3,5,3,2] notice here -1 is out of bounds ,
	//In order to deal with this we use abs().
//SPACE COMPLEXITY = O(1) CONSTANT EXTRA SPACE
//TIME COMPLEXITY = O(N) LINEAR TIME
//ARR = {1,2,1,3,5}
//LOGIC IS , SINCE THE ELEMENTS ARE FOUND ONLY BETWEEN 1 TO N, TRAVERSE THROUGH THE ENTIRE LOOP, GO TO THAT INDEX OF i EX. I=0, ARR[0] = 1, THEN GO TO 
//INDEX 1 AND MAKE THAT NO NEGATIVE, SO MAKE ARR[ARR[I]-1] NEGATIVE. USE abs() TO AVOID CORNER CASES. i.e WHEN ELE IS ALREADY NEGATIVE BUT NO DUPLICATES FOUND.
//IF YOU FIND THE ELEMENT IS ALREADY NEGATIVE THAT NO IS THE FIRST DUPLICATE.
