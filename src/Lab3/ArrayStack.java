package Lab3;

import java.util.Stack;

//3-1
public class ArrayStack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    public ArrayStack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int i) {
        top++;
        stackArray[top] = i;
    }

    public int pop() {
        int result = stackArray[top];
        top--;
        return result;
    }

    public int top() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return (top + 1);
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            for (int i = top - 1; i >= 0; i--) {
                System.out.print(stackArray[i]);
                System.out.println();
            }
        }
    }

    public int search(int n) {
        for (int i = top; i >= 0; i--) {
            if (stackArray[i] == n) {
                return stackArray[i];
            }
        }
        return -1;

    }

    public static void main(String[] args){
        ArrayStack s = new ArrayStack(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(9);
        s.push(7);
        System.out.println(s.top);
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.search(9));
        s.printStack();



    }


}




