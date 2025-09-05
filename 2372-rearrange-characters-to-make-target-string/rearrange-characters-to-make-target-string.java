class Solution {
    public int rearrangeCharacters(String s, String target) {
        char[] ch=s.toCharArray();
        char[] ch1=target.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
         for(int i=0;i<ch1.length;i++){
            map1.put(ch1[i],map1.getOrDefault(ch1[i],0)+1);
        }
        int max=Integer.MAX_VALUE;
        for(char mm:map1.keySet()){
            if(!map.containsKey(mm)){
                return 0;
            }
            max=Math.min(max,map.get(mm)/map1.get(mm));
        }
        return max;
    }
}