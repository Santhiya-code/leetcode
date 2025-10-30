class Solution {
    public String largestOddNumber(String num) {
        int k=num.length()-1;
        if(num.charAt(k)=='1' || num.charAt(k)=='3' || num.charAt(k)=='5' ||  num.charAt(k)=='7' || num.charAt(k)=='9'){
            return num;
        }
        StringBuilder sb=new StringBuilder();
        int n=0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='1' || num.charAt(i)=='3'|| num.charAt(i)=='5'|| num.charAt(i)=='7'|| num.charAt(i)=='9'){
                n=i+1;
                break;
            }
        }
        for(int i=0;i<n;i++){
            sb.append(num.charAt(i));
        }
        return sb.toString();
    }
}