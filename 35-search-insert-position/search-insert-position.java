class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=0;
        while(ans<nums.length && nums[ans]<target)
        {
            ans++;
        }
        return ans;
    }
}