package com.dataStructureSoln;

public class QueueTaskScheduler {
    private String[] taskQueue;
    private int first;
    private int last;
    private int size;
    private int maxCapacity;

    public QueueTaskScheduler(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        taskQueue = new String[maxCapacity];
        first = 0;
        last = -1;
        size = 0;
    }

    public static void main(String[] args) {
        QueueTaskScheduler ts = new QueueTaskScheduler(10);
        ts.addTask("Task 1");
        ts.addTask("Task 2");
        ts.peekTask();
        ts.displayTasks();
        ts.removeTask();
        ts.displayTasks();
    }

    public void addTask(String task) {
        if (size == maxCapacity) {
            throw new IllegalStateException("Queue is full");
        }
        last = (last + 1) % maxCapacity;
        taskQueue[last] = task;
        size++;
    }

    public String removeTask() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        String task = taskQueue[first];
        first = (first + 1) % maxCapacity;
        size--;
        return task;
    }

    public void peekTask() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        System.out.print("First task in queue is: ");
        System.out.print(taskQueue[first]);

    }

    public void displayTasks() {
        System.out.print("Current tasks in queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(taskQueue[(first + i) % maxCapacity] + " ");
        }
        System.out.println();
    }
}
