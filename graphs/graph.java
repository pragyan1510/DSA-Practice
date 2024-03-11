package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class graph {
    private HashMap<String, ArrayList<String>> adjlist = new HashMap<>();

    public void printgraph(){
        System.out.println(adjlist);
    }

    public boolean addvertex(String vertex){
        if (adjlist.get(vertex)==null){
            adjlist.put(vertex,new ArrayList<String>());
            return true;
        }
        return false;
    }

}
