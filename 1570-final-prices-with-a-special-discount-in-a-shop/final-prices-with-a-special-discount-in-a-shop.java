class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            res[i]=prices[i];
        }
        for(int i=0;i<res.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=res[i]){
                    res[i]=res[i]-prices[j];
                    break;
                }
            }
        }
        return res;
    }
}