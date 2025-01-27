package DSA;

import java.util.Scanner;

public class Queue1 {

    Scanner sc = new Scanner(System.in);
    int max = sc.nextInt();

    int Queue[] = new int[max];
    int front = -1;
    int rear = -1;

    public static void main(String[] args) {

    }

    public void enqueue(int data) {

        if (rear == max - 1) {
            System.out.println("queue is full");
            return;

        }

        rear++;
        Queue[rear] = data;

        if (front == -1) {
            front = 0;
        }

    }

    public void dequeue() {

        if (front == -1) {
            System.out.println("queue is empty");
            return;
        } else {
            if (front == rear) {
                front = -1;
                rear = -1;

            } else {
                front++;
            }
        }

    }

}
