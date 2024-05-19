package com.dataStructureSoln;

public class LinkedLists {
    Node head;

    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.addFirst(10);
        ll.addLast(20);
        ll.addAtPosition(15, 1);
        ll.display();
        ll.delete(15);
        ll.display();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    public void addAtPosition(int data, int position) {
        if (position < 0) {
            throw new IndexOutOfBoundsException("Position cannot be negative");
        }
        if (position == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}



