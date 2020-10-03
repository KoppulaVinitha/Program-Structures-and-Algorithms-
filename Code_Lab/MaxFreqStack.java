/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koppu
 */
private class Node {
        int key;
        int val;
        int order;
        public Node (int key, int val, int order) {
            this.key = key;
            this.val = val;
            this.order = order;
        }
    }
    private PriorityQueue<Node> pq;
    private Map<Integer, Integer> map;
    private int order = 0;
    public FreqStack() {
        pq = new PriorityQueue<>((a, b) -> b.val != a.val? b.val - a.val: b.order - a.order);
        map = new HashMap<>();
    }
    
    public void push(int x) {
        map.put(x, map.getOrDefault(x, 0) + 1);
        pq.offer(new Node(x, map.get(x), order++));
    }
    
    public int pop() {
        Node node = pq.poll();
        if(node.val == 1) {
            map.remove(node.key);
        } else {
            map.put(node.key, node.val-1);
        }
        
        return node.key; 
    }