public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {

        int minValue = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {

            minValue = Math.min(minValue, prices[i]);

            if (minValue < prices[i]) {
                maxProfit = Math.max(maxProfit, prices[i] - minValue);

            }
        }
        return maxProfit;
    }

    public static void main(String args[])
    {
        System.out.println(BestTimeToBuyAndSellStock.maxProfit(new int[]{7,6,4,3,1}));
    }
}
