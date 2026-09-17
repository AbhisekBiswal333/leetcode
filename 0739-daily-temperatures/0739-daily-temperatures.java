class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
//BRUTE FORCE APPROACH ---->TLE
    //  int n=temperatures.length;
    //  int answer[]=new int[n];
    //  for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         if(temperatures[i]<temperatures[j]){
    //             answer[i]=j-i;
    //             break;
    //         }
    //     }
    //  }
    //  return answer;

//BETTER APPROACH
    //    int n=temperatures.length;
    //    int answer[]=new int[n];
    //    Stack<Integer> stack = new Stack<>();
    //    stack.push(0);
    //    for(int i=1;i<n;i++){
    //      while(!stack.isEmpty()){
    //         int index=stack.peek();
    //         int tempTop = temperatures[index];
    //         if(tempTop<temperatures[i]){
    //             answer[index]=i-index;
    //             stack.pop();
    //         }else{
    //             break;
    //         }
    //      }
    //      stack.push(i);
    //    }
    //    return answer;


//OPTIMAL APPROACH
     int n=temperatures.length;
     int answer[]=new int[n];
     int warmer=1;
     for(int i=n-1;i>=0;i--){
        int currTemp=temperatures[i];
        if(temperatures[i]>=warmer){
            warmer=currTemp;
            continue;
        }

        int count=1;
        while(true){
            if(temperatures[i+count]>currTemp){
                answer[i]=count;
                break;
            }else{
                count=count+answer[i+count];
            }
        }
     }   
     return answer; 
    }
}