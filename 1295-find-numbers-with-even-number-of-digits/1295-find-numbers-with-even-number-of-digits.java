class Solution {
    public boolean digitCount(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count%2==0;
    }
    public int findNumbers(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(digitCount(nums[i])){
            count++;
        }
       }
       return count;
    }
}