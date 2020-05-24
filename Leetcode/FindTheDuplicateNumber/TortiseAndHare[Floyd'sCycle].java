//The logic behind this algorithm is same as detecting the starting point of the loop.
//Since the intersection wont be always the answer,
// have to find out the starting point of the loop for the right answer.
public solution {
   public int findDuplicate( int[] nums) {
  //Tortise and Hare Alogrithm
        
        int slow = nums[0];
        int fast = nums[0];
        
	//find intersection
        while( true )
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
            
            if(slow == fast)
                break;
        }
        
        //reset start to head.
	//Move both fast and slow at the same pace to reach start point of cycle
        slow = nums[0];
        
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    } 
}

