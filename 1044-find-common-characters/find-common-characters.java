class Solution {
    public List<String> commonChars(String[] words) {
      List<String> str=new ArrayList<>();
       Map<Character,Integer> map=new HashMap<>();
       char[] ch=words[0].toCharArray();
       for(int i=0;i<ch.length;i++){
        map.put(ch[i],map.getOrDefault(ch[i],0)+1);
       }
       for(int i=1;i<words.length;i++){
        Map<Character,Integer> map1=new HashMap<>();
        char[] c=words[i].toCharArray();
        for(int j=0;j<c.length;j++){
            if(map.containsKey(c[j])){
               map1.put(c[j],map1.getOrDefault(c[j],0)+1);
            }
        }
            for(char chh:map1.keySet()){
                if(map.containsKey(chh)){
                map.put(chh,Math.min(map.get(chh),map1.get(chh)));
                }
                else{
                map.remove(chh);
            }
            }
            for(char mm:new HashSet<>(map.keySet())){
                if(!map1.containsKey(mm)){
                    map.remove(mm);
                }
            }
         map1.clear();
       }
       for(char res:map.keySet()){
        int m=map.get(res);
        System.out.print(res+" "+map.get(res));
        while(m>0){
        String sb=String.valueOf(res);
        str.add(sb);
        m--;
        }
       }
       return str;
    }
}