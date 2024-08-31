class Solution {
    public int maxProfit(int[] prices) {
        int buyingPrice = prices[0];
        int profit = 0;
        for(int i = 1; i< prices.length; i++){
            if (buyingPrice > prices[i]){
                buyingPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - buyingPrice);
        }
        return profit;



        /* int price = Integer.MAX_VALUE; // lowest value possible 
        int p = 0;
        if(prices == null || prices.length == 0){
        return 0;
        }
        for(int i = 0; i< prices.length; i++ ){
            if(prices[i]< price){
                price = prices[i];
            }
            else if (prices[i] - price > p){
                p = prices[i] - price;
            } }
            return p;
             */
         
        





         /*int pointer = 0;
        int temp = 0;
        
        for (int i = 0; i< prices.length ; i++){
            for(int j = 1; j < prices.length;j++) {
            if(prices[i] < prices[j]){
                pointer = prices[j] - prices[i];
                if (temp < pointer){
                    temp = pointer;
                }
                pointer = temp;
               }
            else {j++;}
            j++;
            }
        i++;
        }
       return  pointer; */

       
        
    }
}