package sell_stock;

public class BruteForceSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        if(prices.length == 1) return max;

        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[j] - prices[i] > max){
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }
}
