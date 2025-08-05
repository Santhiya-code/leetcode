class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        int cou=0;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<fruits.length;i++){
            boolean fou=false;
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j] && !res.contains(j)){
                       fou=true;
                       res.add(j);
                       break;
                }
            }
            if(!fou){
                count++;
            }
        }
        return count;
    }
}