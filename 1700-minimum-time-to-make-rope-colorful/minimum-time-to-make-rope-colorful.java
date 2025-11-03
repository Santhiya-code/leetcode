class Solution {
    public int minCost(String colors, int[] neededTime) {
        int c=0;
        for(int i=0;i<colors.length()-1;i++){
            char ch=colors.charAt(i);
            if(ch==colors.charAt(i+1)){
                if(neededTime[i]<neededTime[i+1]){
                    c+=neededTime[i];
                }
                else{
                    c+=neededTime[i+1];
                    neededTime[i + 1] = neededTime[i];
                }
            }
        }
        return c;
    }
}