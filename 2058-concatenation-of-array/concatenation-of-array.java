class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length];
        int target[]=new int[nums.length+arr.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        for(int j=0;j<arr.length;j++)
        {
            target[j]=arr[j];
        }
        for(int k=0;k<arr.length;k++)
        {
            target[arr.length+k]=arr[k];
        }
        return target;
    }
}