class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("C"))
            {
                if(!st.isEmpty())
            st.pop();
            }
            else if(operations[i].equals("D"))
            {
                if(!st.isEmpty())
                    st.push(st.peek()*2);
            }
            else if(operations[i].equals("+"))
            {
                int sum=0;
                if(st.size()>=2)
                {
                int top=st.pop();
                int ans=top+st.peek();
               st.push(top);
               st.push(ans);;
            }
        }
        else
        {
            st.push(Integer.parseInt(operations[i]));
        }
        }
        int sum=0;
        for(int num:st)
        {
            sum+=num;
        }
        return sum;
    }
}