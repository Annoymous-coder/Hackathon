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
        
        for(int i=0; i<nums.length; i++)    
        {
            if(nums[Math.abs(nums[i])-1] < 0 )
               return Math.abs(nums[i]);
            else
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
        }
        throw new IllegalArgumentException("No duplicates found");
        
        //Time complecity O(N) , Space complexity O(1)
    }
}