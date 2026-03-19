class Solution {
    public String freqAlphabets(String s) {
        String res="";
        char[] arr=new char[26];
        char m='a';
         for(int i=0;i<arr.length;i++){
              arr[i]=m;
              m++;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
                if(i+2<s.length() && s.charAt(i+2)=='#'){
                    String mm="" + s.charAt(i) + s.charAt(i+1);
                    int j=Integer.parseInt(mm);
                    char h=arr[j-1];
                    res+=h;
                    i+=2;
                }
                else if(c!='#'){
                 int j=c-'0';
                 char h=arr[j-1];
                 res+=h;
            }
        }
        return res;
    }
}