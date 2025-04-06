class Solution {
    public int reverse(int x) {
        
        int temp=Math.abs(x);
        int rev=0;
        while(temp>0){
          int dig=temp%10;

          if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
            return 0;
          }
                    rev=rev*10+dig;
          temp=temp/10;
        }
        return (x>0)?rev:(-rev);
    }
}