class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str=text.split(" ");
        int cou=0;
        for(String sm:str){
            boolean fou=false;
            for(char ch: brokenLetters.toCharArray()){
                if(sm.indexOf(ch)!=-1){
                    fou=true;
                    break;
                }
            }
            if(!fou){
                cou++;
            }
        }
        return cou;
    }
}    