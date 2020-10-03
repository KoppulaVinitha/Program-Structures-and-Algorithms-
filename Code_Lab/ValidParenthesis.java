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
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if (stack.empty())
                return false;
            else if (s.charAt(i) == ')' && !stack.empty() && !stack.pop().equals('('))
                return false;
            else if (s.charAt(i) == '}' && !stack.empty() && !stack.pop().equals('{'))
                return false;
            else if (s.charAt(i) == ']' && !stack.empty() && !stack.pop().equals('['))
                return false;
        }
        return stack.empty();
    }
}