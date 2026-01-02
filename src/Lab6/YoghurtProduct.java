package Lab6;

import java.util.Date;

public class YoghurtProduct implements Comparable {

    int prodID;
    double price;
    Date expiryDate;

    public YoghurtProduct(int id, double p, Date exp){
        prodID = id;
        price = p;
        expiryDate = exp;
    }



    @Override
    public int compareTo(Object o) {
        YoghurtProduct y = (YoghurtProduct) o;
        return  (expiryDate.compareTo(y.expiryDate));
    }
}

