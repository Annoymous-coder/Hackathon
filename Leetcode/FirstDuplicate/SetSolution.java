class Solution {
    public int findDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<Integer>();
        
        for(int i:nums)
        {
            if(set.contains(i)) return i;
            else {
                set.add(i);
            }
        }
        throw new IllegalArgumentException("No duplicates found");
    }
}

//TIME COMPLEXITY : O(N) LINEAR TIME
//SPACE COMLEXITY : O(1) EXTRA SPACE i.e SET
//LOGIC IS TO USE THE DS SET WHICH DOES NOT ALLOW DUPLICATES TO BE ADDED, 
//SO WE CHECK FOR EVERY ELE IF IT ALREADY EXISTS, IF IT DOES THEN RETURN AS THE FIRST DUPLICATE
//ELSE CONTINUE ADDING ELEMENTS TO THE HASHSET.