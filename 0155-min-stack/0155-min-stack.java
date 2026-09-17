//APPROACH-1
// class MinStack {
//     Stack<Integer>Mainstack;
//     Stack<Integer>Minstack;
//     public MinStack() {
//         Mainstack = new Stack<>();
//         Minstack = new Stack<>();
//     }
    
//     public void push(int value) {
//         Mainstack.push(value);
//         if(Minstack.isEmpty()||value<=Minstack.peek()){
//             Minstack.push(value);
//         }
//     }
    
//     public void pop() {
//         int popped = Mainstack.pop();
//         if(popped == Minstack.peek()){
//             Minstack.pop();
//         }
//     }
    
//     public int top() {
//         return Mainstack.peek();
//     }
    
//     public int getMin() {
//         return Minstack.peek();
//     }
// }



//APPROACH-2
// class Node{
//     int val;
//     int min;
//     public Node(int v,int m){
//         this.val=v;
//         this.min=m;
//     }
// }
// class MinStack {
//    Stack<Node>stack;
//     public MinStack() {
//       stack=new Stack<Node>();
//     }
    
//     public void push(int value) {
//        if(stack.isEmpty()){
//          stack.push(new Node(value,value));
//          return;
//        }

//       Node nodeTop = stack.peek();
//       int  minTop = nodeTop.min;
//       if(value<minTop){
//         stack.push(new Node(value,value));
//       }else{
//         stack.push(new Node(value,minTop));
//       }
//     }
    
//     public void pop() {
//        if(stack.isEmpty()){
//         return ;
//        }
//        stack.pop(); 
//     }
    
//     public int top() {
//        if(stack.isEmpty()){
//         return -1;
//        }
//        Node top = stack.peek();
//        return top.val;
//     }
    
//     public int getMin() {
//         if(stack.isEmpty()){
//             return -1;
//         }
//         Node mini = stack.peek();
//         return mini.min;
//     }
// }



//APPORACH-3
class MinNode{
    int min;
    int count;
    public MinNode(int v, int c){
        this.min=v;
        this.count=c;
    }
}
class MinStack {
    Stack<Integer>Mainstack;
    Stack<MinNode>Minstack;
    public MinStack() {
        Mainstack = new Stack<>();
        Minstack = new Stack<MinNode>();
    }
    
    public void push(int value) {
        if(Mainstack.isEmpty()){
            Mainstack.push(value);
            Minstack.push(new MinNode(value,1));
            return;
        }
        Mainstack.push(value);
        MinNode minTop = Minstack.peek();
        if(value==minTop.min){
            minTop.count=minTop.count+1;
        }else if(value<minTop.min){
            Minstack.push(new MinNode(value,1));
        }
    }
    
    public void pop() {
       if(Mainstack.isEmpty()){
         return;
       }
       int popped = Mainstack.pop();
       MinNode minTop = Minstack.peek();
       if(minTop.min==popped){
         if(minTop.count==1){
            Minstack.pop();
         }else{
            minTop.count=minTop.count-1;
         }
       }
    }
    
    public int top() {
        if(Mainstack.isEmpty()){
            return -1;
        }
        return Mainstack.peek();
    }
    
    public int getMin() {
       if(Mainstack.isEmpty()){
        return -1;
       }
       return Minstack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */