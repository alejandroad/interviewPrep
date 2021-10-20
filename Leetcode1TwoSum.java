import java.util.HashMap;

class Leetcode1TwoSum {
    public int[] twoSum(int[] nums, int target) {   
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Not found");
    }
}