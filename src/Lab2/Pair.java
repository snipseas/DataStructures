package Lab2;
import java.util.*;

public class Pair {
    String key;
    int value;
    Pair(String k, int v){
        k = key;
        v = value;
    }

    @Override
public String toString(){
    return (key + " " + value);
}


 class SelectionSort{

    static void selectionSort(Pair[] arr){
        for(int i = 0;i<arr.length; i++){
            int minIndex = i;
            int n = arr.length;
            Pair min = arr[minIndex];
            for(int j = i+1; j< n;j++){
                if(arr[j].value< arr[minIndex].value){
                    minIndex=j;
                }
            }

            Pair temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    }

    static void stableSelectionSort(Pair[] arr){
    }

    public static void main(String[] args){
        Pair[] q ={
                new Pair("A", 9), new Pair("B", 4),

        };
        //stableSelectionSort(q);
        //System.out.println(q.toString());
    }}