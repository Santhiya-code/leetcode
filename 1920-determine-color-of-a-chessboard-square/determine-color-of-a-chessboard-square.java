class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch1=coordinates.charAt(0);
        char ch2=coordinates.charAt(1);
        int res1=0;
        if(ch1=='a' || ch1=='c' || ch1=='e' || ch1=='g'){
            res1=1;
        }
        else{
            res1=2;
        }
        int res2=ch2-'0';
        if((ch1%2!=0 && ch2%2!=0)||(ch1%2==0 && ch2%2==0)){
            return false;
        }
        return true;
    }
}