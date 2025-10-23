class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<command.length()-1;i++){
            if(command.charAt(i)!='(' && command.charAt(i)!=')'){
                sb.append(command.charAt(i));
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append("o");
            }
        }
        if(command.charAt(command.length()-1)!='(' && command.charAt(command.length()-1)!=')'){
            sb.append(command.charAt(command.length()-1));
        }
        return sb.toString();
    }
}