/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koppu
 */
class Solution {
    public NestedInteger deserialize(String s) {
        // if the string contains a single integer
        if (!s.startsWith("[")) return new NestedInteger(Integer.valueOf(s));
        Stack<NestedInteger> stack = new Stack<>();
        NestedInteger res = new NestedInteger();
        stack.push(res);
        int num = 0;
        int sign = 1;
        for (int i = 1; i < s.length(); i++){         
            if (s.charAt(i) == '-'){
                sign = -1;
            } else if (Character.isDigit(s.charAt(i))){
                num = s.charAt(i) - '0';
                while ((i+1)< s.length() && Character.isDigit(s.charAt(i+1))){
                    num = num * 10 + s.charAt(i+1) - '0';
                    i++;
                }
                stack.peek().add(new NestedInteger(num * sign));
                sign = 1;
            } else if (s.charAt(i) == '['){
                NestedInteger nestedInteger = new NestedInteger();
                stack.peek().add(nestedInteger);
                stack.push(nestedInteger);  
            } else if (s.charAt(i) == ']'){
                stack.pop();
            }
        }
        
        return res;    
        
    }
}