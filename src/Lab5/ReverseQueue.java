package Lab5;

import Lab4.StackObj;

import java.util.Queue;

public class ReverseQueue {

    public static QueueObj ReverseRecursion(QueueObj q){
        if(q.isEmpty())
            return q;
        Object data = q.dequeue();
        q = ReverseRecursion(q);
        q.enqueue(data);
        return q;
    }

    public static void ReverseIter(QueueObj q ){
        int size = q.size();
        for(int i = 0; i<size; i++){
            Object curr = q.dequeue();
            for(int j = 0; j<size-1;j++){
                q.enqueue(q.dequeue());
            }
            q.enqueue(curr);
            for(int j = 0; j<i; j++){
                q.enqueue(q.dequeue());
            }
        }
    }

    public static void ReverseStack(QueueObj Q){
        StackObj s = new StackObj(Q.size());
        while(!Q.isEmpty())
            s.push(Q.dequeue());

            while(!s.isEmpty())
                Q.enqueue(s.pop());

    }


    public static QueueObj ReverseQueue(QueueObj q){

        QueueObj reverse = new QueueObj(q.size());

        for(int i = 0; i < q.size(); i++){
            for(int j =0; j<q.size()-1; j++){
                q.enqueue(q.dequeue());
            }
            reverse.enqueue(q.dequeue());
        }
        return reverse;

    }


    public static void main(String[] args){
        QueueObj q = new QueueObj(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(14);
        q.enqueue(15);

        ReverseQueue(q).printQueue();
    }

}
