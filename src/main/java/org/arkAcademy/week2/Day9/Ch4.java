package org.arkAcademy.week2.Day9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class Ch4 {
    public ArrayList<Integer> queueList;

    public Ch4() {
        queueList = new ArrayList<>();
    }

    // Enqueue operation
    public void enqueue(int element) {
        queueList.add(element);
        System.out.println("Enqueued: " + element);
    }

    // Dequeue operation
    public void dequeue() {
        if (!isEmpty()) {
            int dequeuedElement = queueList.remove(0);
            System.out.println("Dequeued: " + dequeuedElement);
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }

    // Peek operation
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Peek: " + queueList.get(0));
        } else {
            System.out.println("Queue is empty. Cannot peek.");
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public static void main(String[] args) {
        Ch4 queue = new Ch4();

        queue.enqueue(5);
        queue.enqueue(10);
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
    }
}

