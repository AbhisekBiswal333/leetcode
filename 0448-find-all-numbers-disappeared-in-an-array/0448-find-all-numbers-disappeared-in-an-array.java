class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    //BRUTE FORCE USING SET
        // Set<Integer> set = new HashSet<>();
        // int n=nums.length;
        // for(int num : nums){
        //     set.add(num);
        // }
        // List<Integer>list=new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     if(!set.contains(i)){
        //         list.add(i);
        //     }
        // }
        // return list;

    //OPTIMAL APPROACH 
           int n=nums.length;
           for(int i=0;i<n;i++){
             int currNum = Math.abs(nums[i]);
             int index=currNum-1;

            if(nums[index]<0){
                continue;
            }
            nums[index]=-1*nums[index];
           }   
           List<Integer>list = new ArrayList<>();
           for(int i=0;i<n;i++){
             if(nums[i]>0){
                list.add(i+1);
             }
           }
           return list;
    }
}