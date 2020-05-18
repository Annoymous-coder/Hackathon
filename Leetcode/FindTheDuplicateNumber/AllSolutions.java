class Solution {
    public int findDuplicate(int[] nums) {
     
        /*Arrays.sort(nums);      //O(nLogn)
        
        for(int i=1; i<nums.length; i++)    //O(n)
        {
            if(nums[i] == nums[i-1])
            {
                return nums[i];
            }
        }
        throw new IllegalArgumentException("No duplicates found");
        
        Total space = O(nLogn + N) = O(N)
        */
        
        /*
        
        //Keep a array to count the occurrence of these numbers , if occurrene >=2 return that element.
        
        int count[] = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) //O(N)
        {
            count[nums[i]]+=1;
        }
        
        for(int i=0; i<count.length; i++) //O(N)
        {
            if(count[nums[i]]>=2)
            {
                return nums[i];
            }
        }
        throw new IllegalArgumentException("No duplicates found");
        
        Total time complexity = O(N + N) = O(N)
            
        */
        
        /*
        
        HashSet <Integer> set = new HashSet <Integer>();
        
        for(int i=0; i<nums.length; i++)    //O(N)
        {
            if(set.contains(nums[i]))
                return nums[i];
            else
                set.add(nums[i]);
        }
        throw new IllegalArgumentException("No duplicates found");
        
        Total time complexity is O(N)
            
        */
        
        /*
        //In place negative value solution
        
        for(int i=0; i<nums.length; i++)    
        {
            if(nums[Math.abs(nums[i])-1] < 0 )
               return Math.abs(nums[i]);
            else
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
        }
        throw new IllegalArgumentException("No duplicates found");
        
        //Time complecity O(N) , Space complexity O(1)
        
        */
        
        /* 
        //Binary search method 1 but requires to be sorted first.
        //The main concept of this approach is ,
        //Check if mid is in right position by index values. Since only a single number reappears many times. Shifting would have taken place. In order to check if mid is in the right position compare with mid+1.
        //If it is in the right position i.e mid>=mid+1 then all the element left of mid are also non-repeating elements. So go searching towards right side
        //If it is not in the right position meaning some elements left of it are repeating so search left hand side of mid.
        //If mid and mid-1 are same then return that mid element.
        //Similarly if mid and mid -1 are same return mid element.
        
 
        
        int low = 0, high = nums.length -1 ;
        
        Arrays.sort(nums);      //O(NlogN)
        
        
        
        while(low<=high)        //O(logN)
        {
            int mid = low + (high - low)/2;
            
            if(mid >0 && nums[mid] == nums[mid-1])
                return nums[mid];
            if(mid < nums.length - 1 && nums[mid] == nums[mid+1])
                return nums[mid];
            
            if(nums[mid] >= mid+1)
            {
                low = mid+1;
            }
            
            else if(nums[mid] != mid+1)
            {
                high = mid-1;
            }
        }
        return -1;
        
        Total time complexity is O(Nlogn)
        
       */
        
        /*
        
        //Binary search solution 2; Without sorting the elements.
        //Keep a count variable to keep count of numbers in the range of [start,mid]
        //If the count > the range between [start,mid] i.e high-low+1 means there are more numbers than the range can hold so search left of mid.
        //Else search right of mid.
        //Goes on start==end so return either star or end.
        
  */       
        int start =1;
        int end = nums.length-1;
        while(start <= end)
        {
        int mid = (start + end)/2;
        int count= 0;
        for(int j = 0;j<nums.length;j++)
        {
        if(nums[j] <= mid && nums[j]>= start)
        {
        count++;
        }
        }
        if(count > (mid-start+1))
        {
        end = mid-1;
        }
        else
        {
        start = mid+1;
        }
        }
        return start;
    

    } 
}