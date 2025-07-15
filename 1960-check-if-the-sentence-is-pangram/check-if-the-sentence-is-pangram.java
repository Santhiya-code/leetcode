class Solution {
    public boolean checkIfPangram(String sentence) {
        int count=0;
        char[] ch=sentence.toCharArray();
        char[] freq=new char[26];
        for(char ch1:ch){
            freq[ch1-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]<1){
                return false;
            }
        }
        return true;
    }
}