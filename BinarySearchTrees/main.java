package BinarySearchTrees;

public class main {
    public static void main(String[] args) {
        BinarySearchTrees mybst = new BinarySearchTrees();
        mybst.Insertbst(23);
        mybst.Insertbst(45);
        mybst.Insertbst(33);
        mybst.Insertbst(44);
        mybst.Insertbst(28);

//        System.out.println( mybst.contain(34) );
//        System.out.println( mybst.contain(23) );


        System.out.println(mybst.root.left.right.value);
    }
}
