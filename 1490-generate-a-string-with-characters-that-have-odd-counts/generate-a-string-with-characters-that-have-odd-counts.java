class Solution {
    public String generateTheString(int n) {
        String res="";
        char c='a';
        if(n%2==0){
        for(int i=0;i<n-1;i++){
            res+='a';
        }
        res+='d';
        }
        else{
            for(int i=0;i<n;i++){
                res+='s';
            }
        }
        

         return res;
    }
}