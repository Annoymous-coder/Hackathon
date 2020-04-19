class Solution {
    public int search(int[] a, int target) {
        int low = 0;
        int high = a.length-1;
        while(low<=high)    //Apply Binary Search
        {
            int mid = (low + high)/2;
            
            if(a[mid] == target)
                return mid;
            else if(a[mid] <= a[high])  //Check if the right half is sorted
            {
                if(target > a[mid] && target <= a[high])    //Check if its present in sorted range
                    low = mid + 1;
                else        //else check in other half
                    high = mid - 1;    
            }
            else    //vice versa as above
            {
                if(target < a[mid] && target >= a[low])
                    high = mid -1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}