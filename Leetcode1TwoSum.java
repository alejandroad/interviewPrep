/**
 * LEETCODE 1: TwoSum (EASY)
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1: 
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]

    CONSTRAINTS:
    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.
 * 
 */

 import java.util.HashMap;

public class Leetcode1TwoSum  {
    
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            // Calculate complement
            int complement = target - nums[i];
            // If the map does not contain the complement, put it in the HashMap
            if(!map.containsKey(complmenet)) {
                map.put(complement, i);
            } else {
                // If it does, we have found the two indicies.
                int[] result = new int[2];
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }
        }
        
        // Did not find
        return -1;
    }
}