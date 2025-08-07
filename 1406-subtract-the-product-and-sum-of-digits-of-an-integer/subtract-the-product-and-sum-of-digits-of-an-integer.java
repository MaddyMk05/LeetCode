class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int sum=0;
        int pro=1;
        while(temp!=0){
            int m=temp%10;
            sum+=m;
            pro*=m;
            temp/=10;
        }
        return pro-sum;
    }
}