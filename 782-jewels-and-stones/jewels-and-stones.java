class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] ch=jewels.toCharArray();
        char[] ch1=stones.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch1.length;i++){
            map.put(ch1[i],map.getOrDefault(ch1[i],0)+1);
        }
        int count=0;
        for(char a:map.keySet()){
            for(int i=0;i<ch.length;i++){
             if(a==ch[i]){
                count+=map.get(ch[i]);
             }
            }
        }
        return count;
    }
}