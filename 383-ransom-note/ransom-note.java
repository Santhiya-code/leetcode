class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        char[] ch=ransomNote.toCharArray();
        char[] ch1=magazine.toCharArray();
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        for(int i=0;i<ch1.length;i++){
            map1.put(ch1[i],map1.getOrDefault(ch1[i],0)+1);
        }
        for(char key:map.keySet()){
            if(map.getOrDefault(key,0)>map1.getOrDefault(key,0)){
                return false;
            }
        }
        return true;
    }
}