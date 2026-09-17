class MinStack {
    Stack<Integer>Mainstack;
    Stack<Integer>Minstack;
    public MinStack() {
        Mainstack = new Stack<>();
        Minstack = new Stack<>();
    }
    
    public void push(int value) {
        Mainstack.push(value);
        if(Minstack.isEmpty()||value<=Minstack.peek()){
            Minstack.push(value);
        }
    }
    
    public void pop() {
        int popped = Mainstack.pop();
        if(popped == Minstack.peek()){
            Minstack.pop();
        }
    }
    
    public int top() {
        return Mainstack.peek();
    }
    
    public int getMin() {
        return Minstack.peek();
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