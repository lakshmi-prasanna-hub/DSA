import java.lang.Math;
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0,profit=0;
        int buyprice=prices[0];
        for(int i=1;i<prices.length;i++){
                if(prices[i]<buyprice){
                   buyprice=prices[i];
                }
                else{
                profit=prices[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
                }   
        }
        return maxprofit;
    }
}
