package org.arkAcademy.week2.Day9;

public class Ch5 {
        int data;
    Ch5 next;

        public Ch5(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        private Ch5 head;

        public LinkedList() {
            this.head = null;
        }

        public void addNode(int data) {
            Ch5 newNode = new Ch5(data);
            if (head == null) {
                head = newNode;
            } else {
                Ch5 current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void removeNode(int data) {
            if (head == null) {
                return;
            }

            if (head.data == data) {
                head = head.next;
                return;
            }

            Ch5 current = head;
            Ch5 prev = null;
            while (current != null && current.data != data) {
                prev = current;
                current = current.next;
            }

            if (current != null) {
                prev.next = current.next;
            }
        }

        public int findLength() {
            int length = 0;
            Ch5 current = head;
            while (current != null) {
                length++;
                current = current.next;
            }
            return length;
        }

        public void reverseList() {
            Ch5 prev = null;
            Ch5 current = head;
            Ch5 nextNode;

            while (current != null) {
                nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }

            head = prev;
        }

        public void printList() {
            Ch5 current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    class Main {
        public void main(String[] args) {
            LinkedList linkedList = new LinkedList();

            linkedList.addNode(1);
            linkedList.addNode(2);
            linkedList.addNode(3);

            System.out.println("Original Linked List:");
            linkedList.printList();

            System.out.println("Length of Linked List: " + linkedList.findLength());

            linkedList.removeNode(2);
            System.out.println("Linked List after removing node with value 2:");
            linkedList.printList();

            linkedList.reverseList();
            System.out.println("Reversed Linked List:");
            linkedList.printList();
        }
    }

