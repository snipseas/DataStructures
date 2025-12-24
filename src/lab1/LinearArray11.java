package lab1;

public class LinearArray11 {

    int itemcount;
    int[] arr;

    // constructor
    public LinearArray11(int maxSize) {
        itemcount = 0;
        arr = new int[maxSize];

        //methods here
    }

    public void insertLast(int x ){

        if(itemcount < arr.length){
            arr[itemcount++] = x;
        }
        else{
            System.out.println("Error in inserting last element");
        }
    }

    public void insertFirst(int x){
        if(itemcount < arr.length){
            for(int i = itemcount; i > 0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = x;
            itemcount++;
        }
    }


    public int linearSearch(int x){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x)
                return arr[i];
            else
                return -1;
        }

        return x;
    }


    public void delete(int x){

        int pos= this.linearSearch(x);
        if(pos ==-1){
            System.out.println("Not found");
        }
        else {
            for (int i = pos; i < arr.length; i++) {
            arr[i] = arr[i+1];
            itemcount--;

                }
            }
        }
    



}