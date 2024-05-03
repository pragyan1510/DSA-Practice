package InsertionSort;

import java.util.Arrays;

public class insertionsort {

    public static void insertionsort(int[] array){
        for (int i = 1; i<array.length;i++){
            int temp = array[i];
            int j = i-1;
            while(j>-1 && temp<array[j]){
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }


    public static void main(String[] args) {

        int[] array = {4,3,5,2,6,1};

        insertionsort(array);

        System.out.println(Arrays.toString(array));

    }
}
