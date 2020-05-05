class Solution {
    public int firstUniqChar(String s) {
        int i, index, check;
        char ans;
        for(i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            index=s.indexOf(c);
            check=s.lastIndexOf(c);
            if(index == check){
                return index;
            }
        }
        return -1;
    }
}