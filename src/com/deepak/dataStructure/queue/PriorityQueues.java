package com.deepak.dataStructure.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLearning {
    public static void main(String[] args) {
        /*Priority Queue*/
        Queue queue=new PriorityQueue();
        queue.add(10);
        queue.add(30);
        queue.add(60);
        queue.add(40);
        queue.add(90);
        queue.add(70);
        System.out.println(queue);
    }
}
