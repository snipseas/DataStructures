package Lab2;
//2-4
import java.util.Arrays;

public class IndexSorting {

    public static int[] IndexSort(int[] a){
        int[] y = new int[a.length];

        for(int i = 0;  i < a.length; i++){
            int index = 0;
            for(int j = 0; j < a.length; j++){
                if((a[j] < a[i]) || a[j] == a[i] && (j<i)){
                    index++;
                }
            }
            y[index] = a[i];
        }
        return y;
    }

    public static void main(String[] args){
        int[] a = {1,5,7,3,6};
        int[] b =IndexSort(a);

        System.out.println(Arrays.toString(b));
    }
}
