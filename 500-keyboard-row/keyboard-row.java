class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        List<String>key=new ArrayList<>();
        for( int i=0;i<words.length;i++){
            String word = words[i];
            String lower = word.toLowerCase();


            boolean isRow1=true;
            boolean isRow2=true;
            boolean isRow3=true;

            for(int j=0; j<lower.length();j++){
                char ch = lower.charAt(j);
                if(row1.indexOf(ch) == -1){
                    isRow1=false;
                }
                if (row2.indexOf(ch) == -1) {
                    isRow2 = false;
                }
                if (row3.indexOf(ch) == -1) {
                    isRow3 = false;
                }
            }

            if(isRow1 || isRow2 || isRow3){
                key.add(word);
            }
        }
        String [] out = new String [key.size()];
        for(int i=0;i<key.size();i++){
            out[i]=key.get(i);
        }
        return out;
        
    }
}