package CommonIntegerArrayQuestion;

public class main {
    public static boolean itemincommon(int[] array1,int[] array2){
        for (int i: array1){
            //this for loop will loop through array1 and i is going to be equal to the value at each index;
            for (int j: array2){
                if (i==j)return true;
            }

        }
        return false;

    }




    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,1};

        System.out.println(itemincommon(array1,array2));

    }
}
