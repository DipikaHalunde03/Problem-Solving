package DSA;

import java.util.Scanner;

class Stackexapmle {

    Scanner sc = new Scanner(System.in);
    int max = sc.nextInt();

    int stack[] = new int[max];
    int top = -1;

    public static void main(String[] args) {

        Stackexapmle st1 = new Stackexapmle();

        st1.push(2);
        st1.push(4);
        st1.push(8);
        st1.push(10);
        System.out.println(st1.peek());

        st1.pop();
        System.out.println(st1.peek());

    }

    public void push(int data) {

        if (top == max - 1) {
            System.out.println("stack is full cant push");
            return;

        }

        top++;
        stack[top] = data;

    }

    public void pop() {
        if (top == -1) {
            System.out.println("stack is empty ");
            return;
        }

        System.out.println(stack[top]);
        top--;

    }

    public int peek() {
        if (top == -1) {
            System.out.println("stack is empty ");
            return 0;
        }

        return stack[top];
    }
}
