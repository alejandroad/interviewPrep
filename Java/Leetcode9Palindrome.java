package Java;
/**
 * Given an integer x, return true if x is palindrome integer.
    An integer is a palindrome when it reads the same backward as forward. 
    For example, 121 is palindrome while 123 is not.

    Example 1: 
    Input: x = 121
    Output: true
 */


class Solution {
    // intuitive approach, just cast the integer into a String and compare each individual char.
    public boolean isPalindrome(int x) {
        String num = x + "";
        int j = num.length()-1;
        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) != num.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        // Approach without a String
        // You make a copy of the paramter, and  you keep adding it to an int var by multiplying it
        // by ten and adding the value left over by modulus 10.
        if(x < 0) {
            return false;
        }    
         int num = x;
         int reversed = 0;
         while(num>0) {
             reversed = reversed*10 + num%10;
             num = num / 10;
         }
         return x == reversed;
     }
}