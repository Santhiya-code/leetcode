class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch=s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while(l<=r){
          if(ch[l]==ch[r]){
            l++;
            r--;
          }
          else if(ch[l]!=ch[r]){
             int k=(int) ch[l];
             int m=(int) ch[r];
             if(k<m){
                ch[r]=ch[l];
             }
             else{
                ch[l]=ch[r];
             }
             l++;
             r--;
          }
        }
        String res="";
        for(int i=0;i<ch.length;i++){
            res+=ch[i];
        }
        return res;
    }
}