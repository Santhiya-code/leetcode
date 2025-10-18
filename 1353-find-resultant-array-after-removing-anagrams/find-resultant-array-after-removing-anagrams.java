class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> arr=new ArrayList<>();
        List<String> res=new ArrayList<>();
        String sto="";
        for(int i=0;i<words.length;i++){
             char[] ch=words[i].toCharArray();
             Arrays.sort(ch);
             String sm=new String(ch);
             if(!sm.equals(sto)){
                res.add(words[i]);
                sto=sm;
             }
             
        }
        return res;
    }
}