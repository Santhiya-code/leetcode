class Solution {
    public String decodeMessage(String key, String message) {
        if (key == null || key.length() == 0 || message == null || message.length() == 0) {
        return "";
    }
        Set<Character> set=new LinkedHashSet<>();
        char[] sa=new char[26];
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)!=' '){
            set.add(key.charAt(i));
            }
        }
        char[] res=new char[set.size()];
        int k=0;
        for(char mm:set){
           res[k]=mm;
           k++;
        }
        int ind=0;
        for(char c='a'; c<='z';c++){
            sa[ind]=c;
            ind++;
        }
       StringBuilder sb=new StringBuilder();
        for(int i=0;i<message.length();i++){
             if(message.charAt(i)==' '){
                    sb.append(" ");
                }
            for(int j=0;j<res.length;j++){
                if(message.charAt(i)==res[j]){
                    sb.append(sa[j]);
                }
            }
        }
            String dh=new String(sb);
            return dh;
    }
}