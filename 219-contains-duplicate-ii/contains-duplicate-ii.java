class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean ans = false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else{
                if(Math.abs(map.get(nums[i]) - i) <= k){
                    ans = true;
                }
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}