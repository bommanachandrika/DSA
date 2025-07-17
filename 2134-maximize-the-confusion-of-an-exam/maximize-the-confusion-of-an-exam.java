class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int count1=0;
        int count2=0;
        int ans=0;
        int l=0;
        int n=answerKey.length();
        for(int r=0;r<n;r++)
        {
            char ch=answerKey.charAt(r);
            if(ch=='T')
            {
                count1++;
            }
            else
            {
                count2++;
            }
            while(Math.min(count1,count2)>k)
            {
                if(answerKey.charAt(l)=='T')
                {
                    count1--;
                }
                else
                {
                    count2--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}