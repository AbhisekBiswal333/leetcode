class Solution {
    public boolean checkDivisibility(int n) {
        int rem;
        int sum=0;
        int product=1;
        int m=n;
        while(m!=0){
            rem=m%10;
            sum=sum+rem;
            product=product*rem;
            m=m/10;
        }
        int sum1=sum+product;
        if(n%sum1==0){
            return true;
        }
        return false;
    }
}