class Solution {
    public int maxArea(int[] height) {
        int sum=0;
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int width=Math.abs(left-right);
            int k=Math.min(height[left],height[right])*width;
            if(k>max){
                max=k;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}