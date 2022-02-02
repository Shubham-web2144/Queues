package com.DSALGO;

public class QueueArr {
//    Queue using array

//    create some static data or variables
    static int arr[];
    static int size; // size of array
    static int rare = -1; // last idx of array

//    create constructor
    QueueArr(int n){ // n is the size of array or lenght of array
        this.size = n;
        this.arr = new int[size];
    }
//    ->isEmpty() function
    public static boolean isEmpty() {
        return rare == -1;
    }
//    ->isFull() function
    public static boolean isFull() {
        return rare == size - 1;
    }
//    ->add() function
    public static  void add(int data) {
        if(isFull()) return;
        rare++;
        arr[rare] = data;
    }
//    ->remove() function
    public static int remove() {
        if(isEmpty()) return -1;
        for(int i = 0; i < rare; i++){
            arr[i] = arr[i+1]; // shift all array elements by one
        }
        rare--;
        return arr[0];
    }
//    ->peek() function
    public static int peek() {
        if(isEmpty()) return -1;
        return arr[0];
    }

    public static void main(String[] args) {
        QueueArr q = new QueueArr(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
