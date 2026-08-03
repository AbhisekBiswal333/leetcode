class Solution {
    public int majorityElement(int[] nums) {
      int n = nums.length;
      int element=0;
      int count=0;
      for(int i=0;i<n;i++){
        if(count==0){
            count=1;
            element=nums[i];
        }else if(nums[i]==element){
            count++;
        }else{
            count--;
        }
      }
      int counter1=0;
      for(int i=0;i<n;i++){
        if(element == nums[i]){
            counter1++;
        }
      }  
       if(counter1 > n/2){
            return element;
        }
        return -1;
    }
}