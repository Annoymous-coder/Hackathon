class Solution { 
    public int peakIndexInMountainArray(int[] A) 
    {
     
        //Recursive Binary Search Intialization and call
        
        int start = 0 , end = A.length - 1 , mid =  0;
        
        //Call Search Method
        return search(A, start, end, mid);
    }
    
    public int search(int A[], int start, int end, int mid)
    {   
        //Binary Search Definition
        
        if(start == end)
            return start;
        
        mid = (start + end)/2;
        
        if(A[mid] > A[mid+1])
            //Recursive Call to search() , end = mid
            return search(A, start, mid, mid);
        
        else
            //Recursive call to search(), start = mid + 1
            return search(A, mid+1, end, mid);
    }
}