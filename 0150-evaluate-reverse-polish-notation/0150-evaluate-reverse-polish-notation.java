class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        String exprStr="*/-+";
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            String token = tokens[i];

            if(exprStr.contains(token)){
                int op2=stack.pop();
                int op1=stack.pop();

                int val=0;
                switch(token){
                    case "+":
                       val=op1+op2;
                       break;
                    case "-":
                       val=op1-op2;
                       break;
                    case "*":
                       val=op1*op2;
                       break;      
                    case "/":
                       val=op1/op2;
                       break;    
                }
                stack.push(val);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}