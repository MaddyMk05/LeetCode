class Solution {
    public boolean isPalindrome(String s) {
        if(s==" "){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String t2 = new StringBuilder(s).reverse().toString();
        return s.equals(t2);
    }
}