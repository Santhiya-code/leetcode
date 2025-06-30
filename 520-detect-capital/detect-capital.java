class Solution {
    public boolean detectCapitalUse(String word) {
        boolean fou=true;
        boolean fou1=true;
        boolean fou2=true;
        for(char ch:word.toCharArray()){
            if(!Character.isUpperCase(ch)){
                fou=false;
            }
        }
         for(char ch:word.toCharArray()){
            if(!Character.isLowerCase(ch)){
                fou1=false;
            }
        }
       
         if (word.length() > 0 && Character.isUpperCase(word.charAt(0))) {
            for (int i = 1; i < word.length(); i++) {
                if (!Character.isLowerCase(word.charAt(i))) {
                    fou2 = false;
                    break;
                }
            }
        } else {
            fou2 = false;
        }
        return fou || fou1 || fou2;
    }
}