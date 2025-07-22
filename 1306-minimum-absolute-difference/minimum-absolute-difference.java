class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            mindiff=Math.min(mindiff,arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]==mindiff)
            {
                List<Integer>list1=new ArrayList<>();
                list1.add(arr[i]);
                list1.add(arr[i+1]);
             list.add(list1);
            }
        }
        return list;
    }
}