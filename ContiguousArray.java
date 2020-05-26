class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        map.put(0,-1);
        for(int i =0;i<nums.length;i++){

            if(nums[i] == 0)
                sum--;
            else
                sum++;

            if(map.containsKey(sum)){

                if(i - map.get(sum) > res)
                    res = i - map.get(sum);

            }else
                map.put(sum, i);
        }
        return res;
    }
}