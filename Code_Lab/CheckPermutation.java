/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koppu
 */
static boolean CheckPermutation(String str1, String str2) {

int l1 = str1.length();
int l2 = str2.length();

if(l1!=l2)
return false;

Char c1[] = str1.toCharArray();
Char c2[] = str2.toCharArray();

Arrays.sort(c1);
Arrays.sort(c2);

for(int i=0; i<n1; i++)
  if(c1[i]!=c2[j])
   return false;

return true;



}
