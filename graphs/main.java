package graphs;

public class main {
    public static void main(String[] args) {
        graph mygraph = new graph();
        mygraph.addvertex("A");

        mygraph.addvertex("B");

        mygraph.addedge("A","B");


        mygraph.printgraph();

        //output
        //{A=[B], B=[A]}
    }
}
