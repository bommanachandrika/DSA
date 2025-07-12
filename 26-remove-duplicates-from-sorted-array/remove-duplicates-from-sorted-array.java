class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer>list1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
        if(!list1.contains(nums[i]))
        {
            list1.add(nums[i]);
        }
        }
        for (int i = 0; i < list1.size(); i++) {
            nums[i] = list1.get(i);
        }

        return list1.size();
    }
}
