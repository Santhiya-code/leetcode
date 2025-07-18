class Solution {
    public int[] decrypt(int[] code, int k) {
    int[] n=new int[code.length];
    if (k > 0) {
    for (int i = 0; i < code.length; i++) {
        int sum = 0;
        int count = 0;
        int j = i + 1;
        while (count < k) {
            sum += code[j % code.length];
            j++;
            count++;
        }
        n[i] = sum;
    }
}

    if(k==0){
        for(int i=0;i<code.length;i++){
            n[i]=0;
        }
    }
    if(k<0){
        for(int i=0;i<code.length;i++){
        int sum=0;
        int count=0;
        int j=i-1;
        while(count<Math.abs(k)){
            if(j<0){
                j+=code.length;
            }
            sum+=code[j%code.length];
            j--;
            count++;
        }
        n[i]=sum;
    }
    }
    return n;
    }
}