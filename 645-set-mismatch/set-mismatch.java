class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate=-1;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i];
            if(!hs.contains(val))
            {
                hs.add(val);
            }
            else
            {
                duplicate=val;
            }
        }
        System.out.println(hs);
        int missing=-1;
        for(int i=0;i<=nums.length;i++)
        {
            if(!hs.contains(i))
            {
                missing=i;
            }
        }
        int result[]={duplicate,missing};
        return result;
    }
}