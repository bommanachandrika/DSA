class Solution {
    public int maxProduct(int n) {
        String str = Integer.toString(n);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0'; 
        }
        int ans = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                int temp = arr[j] * arr[k];
                if (temp > ans) {
                    ans = temp;
                }
            }
        }

        return ans;
    }
}
