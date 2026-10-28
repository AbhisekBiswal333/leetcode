class Solution {
    public int minStartValue(int[] nums) {
        int Sum=0;
        int minValue=0;
        for(int i=0;i<nums.length;i++){
            Sum=Sum+nums[i];
            if(Sum<minValue){
                minValue=Sum;
            }
        }
        return 1-minValue;
    }
}