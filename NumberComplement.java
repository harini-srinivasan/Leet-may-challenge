class Solution {
    public int findComplement(int num) {
        int sum=0,pow=1;
        if(num==1){
            return 0;
        }
        else{
            while(num>0){
                if(num%2 == 0){
                    sum+=pow;
                }
                num=num/2;
                pow*=2;
            }
        }
        return sum;
    }
}