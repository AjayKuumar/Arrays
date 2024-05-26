public class StockBuyandSell {
    static int stockProfit(int[] prices){
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,8,12,1};
        System.out.println(stockProfit(arr));
    }
}
