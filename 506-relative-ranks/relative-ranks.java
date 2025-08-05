class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;

        int sorted [] = score.clone();
        Arrays.sort(sorted);

        Map<Integer, String> rank=new HashMap<>();
        for(int i=0;i<n;i++){
            int place= n-i;
            if(place ==1) {
                rank.put(sorted[i],"Gold Medal");
            }
            else if(place ==2){
                rank.put(sorted[i],"Silver Medal");
            }
            else if(place==3){
                rank.put(sorted[i],"Bronze Medal");
            }
            else{
                rank.put(sorted[i], String.valueOf(place));
            }
        }
        String []  result =new String [n];
        for(int i=0;i<n;i++){
            result[i]=rank.get(score[i]);
        }
        return result;
    }
}