package com.practice.datastructure.Queue;

public class Queue {

    int size;
    int QueueArray[];
    int front,rear=-1;

    public Queue(int size) {
        this.size=size;
        QueueArray=new int[size];
    }
    public boolean isFull(){
        return front == 0 && rear == this.size - 1;
    }
    public boolean isEmpty(){
        if (front == -1  && rear==-1)
            return true;
        else
            return false;
    }
    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is full....");
            System.exit(1);
        }
        if(front==-1)
            front=0;
        rear++;
        QueueArray[rear]=value;
        System.out.println("Inserted Elements"+ value);
    }

    private int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }
            return QueueArray[rear--];}
    void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(QueueArray[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(6);

        // deQueue is not possible on empty queue


        // enQueue 5 elements
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // 6th element can't be added to queue because queue is full
        q.enQueue(6);

        q.display();

        // deQueue removes element entered first i.e. 1
        q.deQueue();


        // Now we have just 4 elements
        q.display();


}
}
