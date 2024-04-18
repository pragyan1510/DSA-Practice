package BinarySearchTrees;

public class main {
    public static void main(String[] args) {
        BinarySearchTrees mybst = new BinarySearchTrees();
        mybst.Insertbst(47);
        mybst.Insertbst(21);
        mybst.Insertbst(76);
        mybst.Insertbst(18);
        mybst.Insertbst(27);
        mybst.Insertbst(82);


        //breadth first search code
        System.out.println(mybst.BFS());

        //depth first search code
        System.out.println(mybst.DFSpreorder());


//        System.out.println( mybst.contain(34) );
//        System.out.println( mybst.contain(23) );


//        System.out.println(mybst.root.left.right.value);

//        System.out.println("\nBST contains 27:");
//        System.out.println(mybst.rcontains(27));
//
//        System.out.println("\nBST contains 33:");
//        System.out.println(mybst.rcontains(33));

//        System.out.println("\n root : "+mybst.root.value);
//        System.out.println("\n Root->left: "+mybst.root.left.value);
//        System.out.println("\n Root->right: "+mybst.root.right.value);
//
//        mybst.deletenode(2);
//
//        System.out.println("\n root : "+mybst.root.value);
//        System.out.println("\n Root->left: "+mybst.root.left.value);
//        System.out.println("\n Root->right: "+mybst.root.right);







    }
}
