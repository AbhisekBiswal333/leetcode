class Solution {
    public int[] replaceElements(int[] arr) {
        //BRUTE FORCE
        // int n=arr.length;
        // int nums[]=new int[n];
        
        // for(int i=0;i<n;i++){
        //     int maxi=-1;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>maxi){
        //             maxi=arr[j];
        //         }
               
        //     }
        //      nums[i]=maxi;
        // }
        // return nums;







        //OPTIMAL
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=max;
            max=Math.max(max,temp);
        }
        return arr;
    }
    
}