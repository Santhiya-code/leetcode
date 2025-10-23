class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> res=new ArrayList<>();
        for(List<String> p:paths){
            String s=p.get(0);
            res.add(s);
        }
        for(List<String> p:paths){
            String sm=p.get(1);
            if(!res.contains(sm)){
                return sm;
            }
        }
        return "";
    }
}