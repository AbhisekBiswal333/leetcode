class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        Set<Integer> set = new HashSet<>();
        for(int nums : arr){
            if(set.contains(2*nums)|| (set.contains(nums/2)&&(nums%2==0))){
                return true;
            }
            set.add(nums);
        }
        return false;
    }
}