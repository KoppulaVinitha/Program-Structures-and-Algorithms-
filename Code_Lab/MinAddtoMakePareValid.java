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
    public int minAddToMakeValid(String S) {
        int ans=0;
        Stack<Character> s=new Stack<Character>();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(')
                s.push('(');
            else
            {
                if(s.isEmpty())
                    ans++;
                else
                    s.pop();
            }
        }
        ans=ans+s.size();
        return ans;
    }
}