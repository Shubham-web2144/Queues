package com.DSALGO;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;


public class QueueJC {
//    Queue using Java Collection Freamworks
    public static void main(String[] args) {
//        Queue using Array
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()){
            System.out.print(q.peek() + "->");
            q.remove();
        }

//        Queue using Linked list
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(11);
        q2.add(22);
        q2.add(33);

        while (!q2.isEmpty()) {
            System.out.println(q2.peek());
            q2.remove();
        }
    }
}
