class Solution {
    public int[] sortArrayByParity(int[] nums) {
    //APPROACH-1 USING COMPARATOE
        // int n=nums.length;
        // Integer res[]=new Integer[n];
        // for(int i=0;i<n;i++){
        //     res[i]=nums[i];
        // }
        // Arrays.sort(res,(val1,val2)->Integer.compare(val1%2,val2%2));
        // for(int i=0;i<n;i++){
        //     nums[i]=res[i];
        // }
        // return nums;


    //APPORACH-2 
    //    int res[] = new int[nums.length];
    //    int index=0;
    //    for(int i=0;i<nums.length;i++){
    //      if(nums[i]%2==0){
    //         res[index]=nums[i];
    //         index++;
    //      }
    //    }
    //    for(int i=0;i<nums.length;i++){
    //     if(nums[i]%2==1){
    //         res[index]=nums[i];
    //         index++;
    //     }
    //    }
    //    return res;


    //APPORACH-3 TWO POINTER
       int i=0,j=nums.length-1;
       while(i<j){
         int mod1=nums[i]%2,
             mod2=nums[j]%2;
         if(mod1==1 && mod2==0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
         }
         if(mod1==0){
            i++;
         }
         if(mod2==1){
            j--;
         }
       }
       return nums;
    }
}