package BinarySearchTrees;

public class main {
    public static void main(String[] args) {
        BinarySearchTrees mybst = new BinarySearchTrees();
        mybst.Insertbst(2);
        mybst.Insertbst(1);
        mybst.Insertbst(3);
     // hi
//        System.out.println( mybst.contain(34) );
//        System.out.println( mybst.contain(23) );


//        System.out.println(mybst.root.left.right.value);

//        System.out.println("\nBST contains 27:");
//        System.out.println(mybst.rcontains(27));
//
//        System.out.println("\nBST contains 33:");
//        System.out.println(mybst.rcontains(33));

        System.out.println("\n root : "+mybst.root.value);
        System.out.println("\n Root->left: "+mybst.root.left.value);
        System.out.println("\n Root->right: "+mybst.root.right.value);

        mybst.deletenode(2);

        System.out.println("\n root : "+mybst.root.value);
        System.out.println("\n Root->left: "+mybst.root.left.value);
        System.out.println("\n Root->right: "+mybst.root.right);





    }
}
