class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // Not enough data to make a profit
        }
         int totalProfit = 0;

        // Iterate through the prices array
        for (int i = 1; i < prices.length; i++) {
            // If the price on the current day is greater than the price on the previous day
            if (prices[i] > prices[i - 1]) {
                // Add the positive difference to totalProfit
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        return totalProfit;

       /* int profit = 0;
        int buyingPrice = prices[0];
       
        int l = prices.length - 1;
        int[] maxProfit = new int[l];

        for(int i = 1; i < prices.length ; i ++){
            int dailyProfit = prices[i] - prices[i - 1];
            if (dailyProfit > 0) {
                maxProfit[i - 1] = dailyProfit; // Store only positive profits
                profit += dailyProfit; // Sum all positive daily profits
            }
            System.out.println(Arrays.toString(maxProfit));
        }
           
        Arrays.sort(maxProfit);
        int largest = maxProfit[maxProfit.length -1];
        int secondlargest = maxProfit[maxProfit.length - 2];

           
        return largest + secondlargest; */
        
    }
}