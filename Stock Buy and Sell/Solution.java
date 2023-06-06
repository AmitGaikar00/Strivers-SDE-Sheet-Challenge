class Solution {
    public int maxProfit(int[] prices) {
        // int n = prices.length;
        int sum = 0;
        int count  = 0;

        for(int i = 1;i < prices.length; i++){

            // if(count >= n ) return 0;

            int tempSum = prices[i] - prices[count];

            if(tempSum < 0) {count = i;}

            sum = Math.max(tempSum, sum);
        }
        return sum;
        
    }
}