class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0,total=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m!=0)
            {
                sum+=i;
            }
            else
            {
                total+=i;
            }
        }
        int diff=sum-total;
        return diff;
        
    }
}