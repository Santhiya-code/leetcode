class Solution {
    public String removeOccurrences(String s, String part) {
        String str=s;
        while(true){
            s=s.replaceFirst(part,"");
            if(s==str){
                break;
            }
            str=s;
        }
        return str;
    }
}