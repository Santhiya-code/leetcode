class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            boolean fou=true;
            char[] ch=allowed.toCharArray();
            char[] chh=words[i].toCharArray();
            for(int j=0;j<chh.length;j++){
                boolean unq=false;
                for(int k=0;k<ch.length;k++){
                      if(chh[j]==ch[k]){
                        unq=true;
                        break;
                      }
                }
                if(!unq){
                    fou=false;
                    break;
                }
            }
            if(fou){
                count++;
            }
        }
        return count;
    }
}