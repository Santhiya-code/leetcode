class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map1=new HashMap<>();
        char[] ch=text.toCharArray();
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        String word="balloon";
        for(char chh:word.toCharArray()){
            map1.put(chh,map1.getOrDefault(chh,0)+1);
        }
        int min=Integer.MAX_VALUE;
        for(char key:map1.keySet()){
            if(!map.containsKey(key)){
                return 0;
            }
            min=Math.min(min,map.get(key)/map1.get(key));
        }
        return min;
    }
}