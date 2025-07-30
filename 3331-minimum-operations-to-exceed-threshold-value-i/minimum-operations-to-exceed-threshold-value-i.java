class Solution {
    public int minOperations(int[] nums, int k) {
        int operations=0;
        for(int arr:nums)
        {
            if(arr<k)
            {
                operations++;
            }
        }
        return operations;
    }
}