package com.dsa.queue;

import java.util.NoSuchElementException;

public class QueueHandler {

    private Integer[] queue;
    private int front;
    private int back;


    public QueueHandler(int capacity){
        queue = new Integer[capacity];
    }
//    0-a
//    1- b
//    2- c
//    3-d
//    4- e

    public void add(int val){
        if(size() == queue.length -1){
            int numOfItems = size();
            Integer[] newArray = new Integer[2 * queue.length];
            System.arraycopy(queue, front, newArray, 0, queue.length-front);
            System.arraycopy(queue, 0, newArray, queue.length-front, back);
            queue = newArray;
            front = 0;
            back = numOfItems;
        }
        queue[back] = val;
        if(back < queue.length - 1){
            back++;
        }
        else back = 0;
    }

    public Integer remove(){
        if(isEmpty())
            throw new NoSuchElementException();
        Integer n = queue[front++];
        if(isEmpty()){
            front = 0;
            back = 0;
        }
        else if(front == queue.length)
            front = 0;
        return n;
    }

    public Integer peek(){
        if(isEmpty())
            throw  new NoSuchElementException();
        return queue[front];
    }

    public int size(){
        if(front <= back)
            return back - front;
        return back-front+queue.length;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void printQueue(){
        if(front < back){
        for(int i = front ; i < back ; i++)
            System.out.println(queue[i]);
        }
        else{
            for(int i = front ; i < queue.length ; i++)
                System.out.println(queue[i]);
            for(int i = 0 ; i < back ; i++)
                System.out.println(queue[i]);
        }
    }
}
