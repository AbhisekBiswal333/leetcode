class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        //[9,9,9]
        //for the above edge case
        int newArr[]=new int[n+1];
        newArr[0]=1;
        digits=newArr;
        return digits;
    }
}