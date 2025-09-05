class Solution {
    public int maxProfit(int[] prices) {
          int res=0;
          int min=Integer.MAX_VALUE;
          int maxpro=0;
          for(int i=0;i<prices.length;i++){
                if(prices[i]<min){
                    min=prices[i];
                }
                else if(prices[i]-min>maxpro){
                   maxpro=prices[i]-min;
                }
          }
          return maxpro;
    }
}