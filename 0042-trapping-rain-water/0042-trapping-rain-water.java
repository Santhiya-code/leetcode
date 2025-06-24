class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lhb=height[l];
        int rhb=height[r];
        int res=0;
        while(l<=r){
            if(lhb<=rhb){
                if(lhb<=height[l]){
                    lhb=height[l];
                }
                else{
                    res=res+lhb-height[l];
                }
                l++;
            }
        
       else{
                if(rhb<=height[r]){
                    rhb=height[r];
                }
                else{
                    res=res+rhb-height[r];
                }
                r--;
            }
        }return res;
    }
}
