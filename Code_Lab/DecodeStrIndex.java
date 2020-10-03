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
    public String decodeAtIndex(String S, int K) {
        char[] chs = S.toCharArray();
        
        long stemLen = 0;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] >= '2' && chs[i] <= '9') {
                long multi = chs[i]-'0';
                
                if (stemLen * multi >= K) {
                    return decodeAtIndex(S, (int) ((K % stemLen + stemLen-1) % stemLen + 1));
                } else {
                    stemLen = stemLen * multi;
                }
            } else {
                stemLen++;
                if (stemLen == K) {
                    return Character.toString(chs[i]);
                }
            }
        }
        
        return "";
    }
}