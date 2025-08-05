class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] str=s.split(" ");
        if(pattern.length()!=str.length){
            return false;
        }
        Map<Character, String> chartoword =new HashMap<>();
        Map<String, Character> wordtochar =new HashMap<>();
            for(int i=0;i<pattern.length();i++){
                char ch=pattern.charAt(i);
                String w= str[i];

                if(chartoword.containsKey(ch)){
                    if(!chartoword.get(ch).equals(w)){
                        return false;
                    }
                }else{
                    chartoword.put(ch, w);
                }

                if(wordtochar.containsKey(w)){
                    if(wordtochar.get(w) != ch ){
                        return false;
                    }
                }
                    else{
                        wordtochar.put(w,ch);
                }
            }
            return true;
    }
}