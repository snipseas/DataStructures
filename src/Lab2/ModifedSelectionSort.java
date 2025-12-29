
package Lab2;
//2-4
import java.util.Arrays;

public class ModifedSelectionSort {
    public static int[] ModifedSelectionSorts(int[] a){
        for(int i = 0; i < a.length/2; i++){
            int minIndex = i;
            int maxIndex = i;
            int min = a[minIndex];
            int max = a[maxIndex];

            for(int j = i+1; j < a.length-1;j++){
                if(a[j] < min){
                    minIndex = j;
                    min = a[minIndex];
                }

                if(a[j] >= max){
                    maxIndex = j;
                    max = a[maxIndex];
                }
            }

            a[minIndex] = i;
            a[i] = min;

            if(maxIndex==i){
                maxIndex=minIndex;
                a[maxIndex] = a[a.length-i-1];
                a[a.length-i-1]=max;
            }

        }
        return a;
    }


    public static void main(String[] args){
        int[] a = {1,5,7,3,6};
        int[] b =ModifedSelectionSorts(a);

        System.out.println(Arrays.toString(b));
    }

}
