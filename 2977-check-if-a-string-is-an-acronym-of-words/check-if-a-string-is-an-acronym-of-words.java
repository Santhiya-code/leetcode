class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String res="";
        for(int i=0;i<words.size();i++){
            char[] ch=words.get(i).toCharArray();
            char mm=ch[0];
            res+=mm;

        }
        if(res.equals(s)){
            return true;
        }
        return false;
    }
}