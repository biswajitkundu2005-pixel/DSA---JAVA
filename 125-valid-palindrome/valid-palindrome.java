class Solution {
    public boolean isPalindrome(String s) {

        // 1. Remove non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 3. Reverse
        String rev = new StringBuilder(s).reverse().toString();

        return s.equals(rev);
    }
}