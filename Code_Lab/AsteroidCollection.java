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
      public int[] asteroidCollision(int[] asteroids) {
        if (asteroids == null) return null;
        else if (asteroids.length <= 1) return asteroids;
        
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            if (i > 0) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && Math.abs(stack.peek()) < Math.abs(i))  stack.pop();
                if (stack.isEmpty() || stack.peek() < 0) stack.push(i);
                else if (stack.peek() == Math.abs(i)) stack.pop();
            }
        }
        
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--)
            res[i] = stack.pop();
        
        return res;
    }
}