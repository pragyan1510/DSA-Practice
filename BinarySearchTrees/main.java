package BinarySearchTrees;

public class main {
    public static void main(String[] args) {
        BinarySearchTrees mybst = new BinarySearchTrees();
        mybst.Insertbst(23);
        mybst.Insertbst(45);
        mybst.Insertbst(33);
        mybst.Insertbst(44);
        mybst.Insertbst(28);
     // hi
//        System.out.println( mybst.contain(34) );
//        System.out.println( mybst.contain(23) );


//        System.out.println(mybst.root.left.right.value);

        System.out.println("\nBST contains 27:");
        System.out.println(mybst.rcontains(27));

        System.out.println("\nBST contains 33:");
        System.out.println(mybst.rcontains(33));


        //OUTPUT:-
//        BST contains 27:
//        false
//
//        BST contains 33:
//        true

    }
}
