class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<> ();
        int maxval=0, maxkey=0;
        if(nums.length == 1) {
            return nums[0];
        }
        for(int num:nums){
            if(map.containsKey(num)){
                int count = map.get(num);
                count+=1;
                map.put(num,count);
                if(count>maxval){
                    maxval=count;
                    maxkey=num;
                }
            }
            else{
                map.put(num,1);
            }
        }
        return maxkey;
        
    }
}