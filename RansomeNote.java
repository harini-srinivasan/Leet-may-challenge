class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int i, index;
        char c, temp='A';
        for(i=0;i<ransomNote.length();i++){
            c=ransomNote.charAt(i);
            index=magazine.indexOf(c);
            if(index==-1){
                return false;
            }
            else{
                magazine = magazine.substring(0,index)+ temp + magazine.substring(index+1);         
            }
        }
        return true;
    }
}