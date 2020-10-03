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
    

public String removeDuplicateLetters(String s) {
        int n = s.length();
        int freq[] = new int[26];
        boolean taken[] = new boolean[26];
        char chArr[] = s.toCharArray();
        int resLen = 1;
        for(char ch : chArr){
            freq[ch-'a']++;
            if(freq[ch-'a']==1) resLen++;
        }
        
        
        StringBuilder result = new StringBuilder(resLen);
        result.append('0');
        
        for(char ch : chArr){
            freq[ch-'a']--;
            if(!taken[ch-'a']){
                while(result.charAt(result.length()-1)>ch && freq[result.charAt(result.length()-1)-'a']>0){
                    taken[result.charAt(result.length()-1)-'a'] = false;
                    result.deleteCharAt(result.length()-1);
                    
                }
                result.append(ch);
                taken[ch-'a'] = true;
            }
        }
        
        return result.substring(1).toString();
    }
}