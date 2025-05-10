package com.dsa.queue;

public class QueueMain {
    public static void main(String[] args) {
        useQueueHandler();
    }
    private static void useQueueHandler(){
        QueueHandler queue = new QueueHandler(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        queue.remove();

        System.out.println("Peeked : " +  queue.peek());

        queue.printQueue();
    }
}
