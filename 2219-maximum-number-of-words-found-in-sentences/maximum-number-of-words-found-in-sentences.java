class Solution {
    public int mostWordsFound(String[] sentences) {
        int co=0;
        for(int i=0;i<sentences.length;i++){
            String str=sentences[i];
             String[] res=str.split(" ");
             if(res.length>co){
                co=res.length;
             }
        }
        return co;
    }
}