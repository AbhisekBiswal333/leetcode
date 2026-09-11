class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<end){
            if(arr[start]<arr[start+1]){
               start++;
            }else if(arr[end]<arr[end-1]){
                end--;
            }else{
                break;
            }
        }
        return start!=0 && end!=n-1 && start==end;
    }
}