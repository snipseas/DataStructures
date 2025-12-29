package Lab2;

import java.util.Arrays;

public class ShakerSorting {

    public static int[] ShakerSort(int[] a){
        int temp;
        for(int i = 0; i< (a.length/2);i++){
            for(int j = i; j < (a.length-1); j++){
                if(a[j]>a[j+1]){
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                }
            }
            for(int k = a.length-2-1; k>i; k--){
                if(a[k] < a[k-1]){
                    temp = a[k];
                    a[k] = a[k-1];
                    a[k-1] = temp;
                }
            }
        }
        return a;
    }


    public static void main(String[] args){
        int[] a = {1,5,7,3,6};
        int[] b =ShakerSort(a);

        System.out.println(Arrays.toString(b));
    }

}
