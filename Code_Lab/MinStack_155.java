/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koppu
 */
class MinStack {

    
    
    static Stack<int[]> st=new Stack<>();
    public MinStack() {
        st=new Stack<>();
        
    }
    public static void push(int x) {
        if(st.isEmpty()){
            int[] te={x,x};
            st.push(te);
        }
        else{
            if(st.peek()[1]>=x){
                int[] te={x,x};
                st.push(te);
            }else{
                int[] te={x,st.peek()[1]};
                st.push(te);
            }
        }
    }
    
    public static void pop() {
        st.pop();
    }
    
    public static int top() {
        return st.peek()[0];
    }
    
    public static int getMin() {
        return st.peek()[1];
    }
}