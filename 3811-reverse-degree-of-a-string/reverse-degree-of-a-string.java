class Solution {
    public int reverseDegree(String s) {
        Map<Character,Integer> map=new HashMap<>();
        char c='z';
        for(int i=1;i<=26;i++){
           map.put(c,i);
           c--;
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            for(char key:map.keySet()){
                if(key==ch){
                   int l=(i+1)*map.get(key);
                   sum+=l;
                }
            }
        }
        return sum;
    }
}