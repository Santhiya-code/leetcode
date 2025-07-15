class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
             String ans=strs[i];
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            if(!map.containsKey(str)){
            map.put(str,new ArrayList<>());
            }
            map.get(str).add(ans);
        }
        return new ArrayList<>(map.values());
    }
}