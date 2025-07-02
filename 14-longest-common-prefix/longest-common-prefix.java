class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        char[] ch=strs[0].toCharArray();
        char[] ch1=strs[n-1].toCharArray();
        String str="";
        for(int i=0;i<ch.length;i++){
            boolean fou=true;
            if(ch[i]==ch1[i]){
                str+=ch[i];
            }
            else if(ch[i]!=ch1[i]){
                fou=false;
                break;
            }
            if(!fou){
                break;
            }
        }
        return str;
    }
}