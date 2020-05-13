*/
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.


You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version.
 You should minimize the number of calls to the API.


Example:


Given n = 5, and version = 4 is the first bad version.


call isBadVersion(3) -> false

call isBadVersion(5) -> true

call isBadVersion(4) -> true


Then 4 is the first bad version.
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */



//The logic of the program is to just same as finding the first occurence of a number. here find first true call.
//Corner case: If first element only is true for badversion then all the subsequent elements are bad too. So return 1 for them.
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int low = 1, high = n;
        return search(n,low,high);
    }
    
    public int search(int n, int low, int high)
    {
        int result = 0;
           
        if(isBadVersion(1)==true)
            return 1;
        
        while(low <= high)
        {
            
            int mid = low+(high-low)/2;
            
            if(isBadVersion(mid))
            {
                result = mid;
		//Traverse lhs in hope of finding even lesser index  of first bad version.
                high = mid - 1;
            }
            
	    //if mid is false then all the elements left of it are also false so move rhs.
            else if(isBadVersion(mid) == false)
            {	
                low = mid + 1;
            }
	    //opposite of above.
            else
            {
                high = mid -1 ;
            }
        
        }
        return result;
    }
    
}