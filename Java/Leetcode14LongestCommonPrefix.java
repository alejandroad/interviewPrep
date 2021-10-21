/**
 *Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // edge case if array is empty
        if(strs == null || strs.length == 0) {
            return "";
        }
        // edge case if there is only 1 thing in the array
        if(strs.length == 1) {
            return strs[0];
        }
        // compare to first string chars
        for(int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                // can return becaseu substring is [inclusive, exclusvive)
                if(strs[j].length() <= i||strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}