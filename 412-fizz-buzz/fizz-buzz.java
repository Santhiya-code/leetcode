class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> mm=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                mm.add("FizzBuzz");
            }
            else if(i%3==0){
                mm.add("Fizz");
            }
            else if(i%5==0){
                mm.add("Buzz");
            }
            else{
                String k=String.valueOf(i);
                mm.add(k);
            }
        }
        return mm;
    }
}