class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max=releaseTimes[0];
        char ch=keysPressed.charAt(0);
        for(int i=1;i<releaseTimes.length;i++){
            int res=Math.abs(releaseTimes[i-1]-releaseTimes[i]);
                if(res==max && keysPressed.charAt(i)>ch){
                max=res;
                ch=keysPressed.charAt(i);
                }
                else if(res>max){
                     max=res;
                ch=keysPressed.charAt(i);
                }
            }
        
        return ch;
    }
}