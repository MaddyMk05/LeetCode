class Solution {
    public boolean isPalindrome(String s) {
        if(s==" "){
            return true;
        }
        String str=s.toLowerCase();
        char [] ch=str.toCharArray();
        String t1 = "";
        for(int i=0;i<str.length();i++){
            if((ch[i]>='a' && ch[i]<='z')||(ch[i] >= '0' && ch[i] <= '9')){
                t1 += ch[i];
            }
        }
        String t2 = new StringBuilder(t1).reverse().toString();
        return t1.equals(t2);
    }
}