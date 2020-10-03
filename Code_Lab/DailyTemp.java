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
    public int[] dailyTemperatures(int[] arr) {
        Stack<Pair> st=new Stack<>();
        int n=arr.length,res[]=new int[n];
        for(int i=0;i<arr.length;i++){
            Pair p=new Pair(i,arr[i]);
            if(st.size()==0){
                st.push(p);
            }
            else{
                while(st.size()!=0 && st.peek().ele<p.ele){
                    Pair t=st.pop();
                    res[t.pos]=p.pos-t.pos;
                }
                st.push(p);
            }
            
        }
        return res;
    }
}   
class Pair{
    int pos=0,ele=0;
    Pair(int pos,int ele){
        this.pos=pos;
        this.ele=ele;
    }
}