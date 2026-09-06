class Solution {
    public boolean isPalindrome(String s) {
        String rmNonAlphaNum = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverseString = new StringBuilder(rmNonAlphaNum).reverse().toString();
        return rmNonAlphaNum.equals(reverseString);
    }
}