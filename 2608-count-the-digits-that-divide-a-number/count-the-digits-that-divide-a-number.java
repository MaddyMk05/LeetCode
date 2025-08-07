class Solution {
    public int countDigits(int num) {
        int temp=num;
        int c=0;
        while(temp!=0){
            int m=temp%10;
            if(num%m==0){
                c++;
            }
            temp/=10;
        }
        return c;
    }
}