class Solution {
    public int numJewelsInStones(String J, String S) {
        int count =0,i;
        for(i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(J.indexOf(c) != -1){
                count+=1;
            }
        }
        return count;
    }
}