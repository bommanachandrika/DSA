class Solution {
    public int smallestEvenMultiple(int n) {
        int ans;
        if(n%2==0)
        {
            return n;
        }
        else
        {
            ans= n*2;
        }
        return ans;
    }
}