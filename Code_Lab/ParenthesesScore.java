/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koppu
 */
class solution{
     public int scoreOfParentheses(String S) {
        int[] pow = new int[26];
        pow[0] = 1;
        for (int i = 1; i < pow.length; i++) {
            pow[i] = pow[i-1] * 2;
        }
        
        int count = 0, score = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                count++;
            } else {
                count--;
                if (S.charAt(i - 1) == '(') score += pow[count];
            }
        }
        
        return score;
    }
}