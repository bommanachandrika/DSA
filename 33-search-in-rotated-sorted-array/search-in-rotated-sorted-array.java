class Solution {
    public int search(int[] nums, int target) {
        int index=-1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                index=i;
                break;
            }
        }
        return index;
    }
}