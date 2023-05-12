package com.codewithLeetCode;

import java.awt.color.ICC_ColorSpace;
import java.util.HashMap;

public class LRUCache {
    class Node{
        Node next;
        Node prev;
        int key =0, value =0;
        Node(int _key, int _value)
        {
            key =  _key;
            value = _value;
        }
    }
    Node head =  new Node(0, 0);
    Node tail =  new Node(0, 0);
    int capacity;
    HashMap<Integer, Node> map  = new HashMap<>();
    public LRUCache(int _capacity) {
        capacity = _capacity;
        head.next = tail;
        tail.prev =  head;
    }


    public int get(int key) {
if(map.containsKey(key)){

    Node node = map.get(key);
    removeN(node);
    insert(node);

    return node.value;
}
else{
    return -1;
}
    }

    public void put(int key, int value) {
if(map.containsKey(key))
{
    removeN(map.get(key));
}
if(capacity==map.size())
{
    removeN(map.get(tail.prev));
}
insert(new Node(key, value));
    }


    public void removeN(Node node){
        map.remove(node.key);
        node.prev.next =node.next;
        node.next.prev = node.prev;
    }
    public void insert(Node node)
    {
        map.put(node.key, node);
       Node headnext = head.next;
       head.next =node;
       node.prev = head;
       node.next = headnext;
       headnext.prev = node;
    }
    public static void main(String[] args) {

    }
}
