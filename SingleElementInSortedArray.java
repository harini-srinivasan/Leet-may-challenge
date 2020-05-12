class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=-1;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;){
            if(i==(nums.length-1)){
                res=nums[i];
                break;
            }
            else if(nums[i]!=nums[i+1]){
                res= nums[i];
                break;
            }
            i=i+2;
        }
        return res;
    }
}