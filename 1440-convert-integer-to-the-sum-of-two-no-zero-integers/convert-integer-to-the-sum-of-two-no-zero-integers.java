class Solution {
    public int[] getNoZeroIntegers(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<n;i++){
               int  j=n-i;
                if (!containsZero(i) && !containsZero(j)) {
                   return new int[]{i,j};
                }
        }
        return new int[0];

        }
        public static boolean containsZero(int num){
            while(num!=0){
                if(num%10==0){
                    return true;
                }
                num=num/10;
            }
            return false;
        }
        
    }
