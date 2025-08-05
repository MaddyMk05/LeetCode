class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candy=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            candy.add(candyType[i]);
        }
        int maxC= candyType.length/2;
        int eat = Math.min(candy.size(),maxC);   

        return eat;
    }
}