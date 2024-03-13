package graphs;

public class main {
    public static void main(String[] args) {
        graph mygraph = new graph();
        mygraph.addvertex("A");
        mygraph.addvertex("B");
        mygraph.addvertex("C");
        mygraph.addvertex("D");

        mygraph.addedge("A","B");
        mygraph.addedge("A","C");
        mygraph.addedge("A","D");
        mygraph.addedge("B","D");
        mygraph.addedge("C","D");


        mygraph.removeVertex("D");



        mygraph.printgraph();

        //output
        //{A=[B], B=[A]}
    }
}
