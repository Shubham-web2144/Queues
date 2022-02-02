package com.DSALGO;


public class Queues {
//    Queue using LinkedList
//    Creating Node for LL
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
//    Create Queue class
    static class QueueLL{
        static Node head = null;
        static Node tail = null;

    //    ->isEmpty() function
    static boolean isEmpty() {
        return head == null && tail == null;
    }

    //    ->add() function

    static void add(int data) {
        Node newNode = new Node(data);

        if(isEmpty()){
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    //    ->remove() function

    static int remove() {
        if(isEmpty()) {
            return -1;
        }

        int front = head.data;

        if(head == tail) {
            tail = null;
        }

        head  = head.next;

        return front;
    }

    //    ->peek() function

    static int peek() {
        if(isEmpty()) return -1;

        return head.data;
    }

    }


    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
