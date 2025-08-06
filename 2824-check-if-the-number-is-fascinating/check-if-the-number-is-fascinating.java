class Solution {
    public boolean isFascinating(int n) {
        StringBuilder sb=new StringBuilder();
        int a=2*n;
        int b=3*n;
        String str=String.valueOf(n);
        sb.append(str);
        String sm=String.valueOf(a);
        String nm=String.valueOf(b);
        sb.append(sm);
        sb.append(nm);
        String strr = sb.toString();
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:strr.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char chh:map.keySet()){
            if(chh=='0'){
                return false;
            }
            if(map.get(chh)>1){
                return false;
            }
        }
        return true;
    }
}