class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> first=new ArrayList<>();
        first.add(1);
        ans.add(first);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> second=new ArrayList<>();
            second.add(1);
            for(int j=1;j<i;j++)
            {
                int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                second.add(val);
            }
            second.add(1);
            ans.add(second);
        }
        return ans;
        
    }
}