public class buy_sell_stock {
    public static int maxProfit( int [] prices){
        int n = prices.length;
        int profit1 = 0;
        int buy1 = prices[0];
        int sell1 = prices[0];
        for(int i = 0; i<n; i++){
            if(prices[i]<buy1){
                buy1 = prices[i];
            }
            else if(prices[i]-buy1>profit1){
                sell1 = prices[i];
                profit1 = sell1-buy1;}
        }
        return profit1;
    }
}
