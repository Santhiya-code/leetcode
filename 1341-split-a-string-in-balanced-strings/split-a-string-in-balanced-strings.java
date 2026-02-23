class Solution {
    public int balancedStringSplit(String s) {
        int len=0;
        for(int i=0;i<s.length();i++){
            int cr=0;
            int cl=0;
            for(int j=i;j<s.length();j++){
                    if(s.charAt(j)=='R'){
                        cr++;
                    }
                    else{
                        cl++;
                    }
                }
                if(cr==cl){
                    len++;
                }
                cr=0;
                cl=0;
            }
        return len;
    }
}