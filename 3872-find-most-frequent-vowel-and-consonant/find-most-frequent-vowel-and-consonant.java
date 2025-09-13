class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map1=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I'|| ch=='O' || ch=='o' || ch=='u' || ch=='U'){
            map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        for(char ch:s.toCharArray()){
             if(!(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I'|| ch=='O' || ch=='o' || ch=='u' || ch=='U')){
                    map1.put(ch,map1.getOrDefault(ch,0)+1);
            }
        }
        int sum=0;
        int max=0;
        int max1=0;
        for(char key: map.keySet()){
            if(map.get(key)>max){
           max=map.get(key);
        }
    }
         for(char key: map1.keySet()){
            if(map1.get(key)>max1){
           max1=map1.get(key);
        }
         }
         sum=max1+max;
        return sum;
    }
}