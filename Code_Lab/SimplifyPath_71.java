/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koppu
 */
class Solution
{
    public String simplifyPath(String path)
    {
        
        ArrayDeque<String> dq = new ArrayDeque<>();
        for (String s : path.split("/"))
        {
            if (s.equals(".") || s.equals(""))
                continue;
            else if (s.equals(".."))
            {
                if (!dq.isEmpty())
                    dq.removeLast();
            }
            else
                dq.add(s);
        }
        StringBuilder sb = new StringBuilder();
        
        sb.append('/');
        for (String s : dq)
        {
            sb.append(s);
            sb.append('/');
        }
        if (dq.size() > 0)
            sb.setLength(sb.length() - 1);
        if (sb.length() == 0)
            sb.append('/');
        return sb.toString();
    }
}