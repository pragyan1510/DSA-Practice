package CommonIntegerArrayQuestion;

import hashtables.HashTable;

import java.util.HashMap;

public class main {
    public static boolean itemincommon(int[] array1,int[] array2){
//        for (int i: array1){
//            //this for loop will loop through array1 and i is going to be equal to the value at each index;
//            for (int j: array2){
//                if (i==j)return true;
//            }
//
//        }
//        return false;

        //we can also do this with hash tables
        HashMap<Integer,Boolean> myhashmap = new HashMap<>();
        for (int i: array1){
            myhashmap.put(i,true);

        }
        for (int j:array2){
            if (myhashmap.get(j)!=null)return true;
        }
        return false;


    }




    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,9};

        System.out.println(itemincommon(array1,array2));

    }
}
