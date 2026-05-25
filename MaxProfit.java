class MaxProfit {
    public int maxProfit(int[] prices) {
        // Code here
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int price : prices)
        {
            if(price < minPrice)
            {
                minPrice = price;
            }
            else
            {
                maxPro = Math.max(maxPro, price - minPrice );
            }
        }
       return maxPro;
        
    }
}
