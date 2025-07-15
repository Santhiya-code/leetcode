class Solution {
    public boolean isValid(String word) {
        char[] ch=word.toCharArray();
        int count=0;
        boolean vow=false;
        boolean conso=false;
        boolean dig=false;
        for(char ch1:ch){
            count++;
            if(Character.isDigit(ch1)){
                dig=true;
            }
            else if(ch1=='A' || ch1=='a' || ch1=='E' || ch1=='e' || ch1=='I' || ch1=='i' || ch1=='O' || ch1=='o' ||ch1=='U' || ch1=='u'){
                vow=true;
            }
            else if(!(Character.isLetter(ch1) || Character.isDigit(ch1))){
                return false;
            }
            else{
                conso=true;
            }
        }
        if(count>=3){
            if(vow && conso){
                return true;
            }
        }
        return false;
    }
}