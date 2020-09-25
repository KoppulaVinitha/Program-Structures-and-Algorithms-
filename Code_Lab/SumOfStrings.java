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
    public String addStrings(String num1, String num2) {
        int m=num1.length()-1;
        int n=num2.length()-1;
        int carry=0;
        StringBuilder result=new StringBuilder();
        while(m>=0 || n>=0){
            int sum=carry;
            if (m>=0) sum+=num1.charAt(m--)-'0';
            if (n>=0) sum+=num2.charAt(n--)-'0';
            result.append(sum%10);
            carry=sum/10;
        }
        if(carry!=0) result.append(carry);
        
        return result.reverse().toString();
    }
}