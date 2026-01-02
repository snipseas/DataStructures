package Lab6;

import Lab4.StackObj;

public class Supermarket{
    PriorityQueue pq;
    public Supermarket(int maxProdNum){
        pq = new PriorityQueue(maxProdNum);
    }

    public void addProd(YoghurtProduct y){
        if(!pq.isFull())
            pq.insert(y);
        else
            System.out.println("full");
    }

    public double newPrice(int productID){
        StackObj tmp = new StackObj(pq.size());
        int unique = -1;
        double price = -1.0;

        while(!pq.isEmpty()){
            YoghurtProduct cur = (YoghurtProduct)pq.remove();
            if(tmp.isEmpty() || !((YoghurtProduct)tmp.top()).expiryDate.equals(cur.expiryDate))
                unique++;
        }

    }
}
