class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            String token = tokens[i];

            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = st.pop();
                int a = st.pop();

                switch(token){
                    case "+":
                        st.push(a+b);
                        break;
                    case "-":
                        st.push(a-b);
                        break;
                    case "*":
                        st.push(a*b);
                        break;
                    case "/":
                        st.push(a/b);
                        break;
                }
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
