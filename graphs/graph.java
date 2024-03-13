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

    public boolean addedge(String vertex1, String vertex2){
        if(adjlist.get(vertex1)!=null && adjlist.get(vertex2)!=null){
            adjlist.get(vertex1).add(vertex2);
            adjlist.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
    public boolean removeedge(String vertex1,String vertex2){
        if(adjlist.get(vertex1)!=null && adjlist.get(vertex2)!=null){
            adjlist.get(vertex1).remove(vertex2);
            adjlist.get(vertex2).remove(vertex2);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(adjlist.get(vertex)==null)return false;
        for (String othervertex : adjlist.get(vertex)){
            adjlist.get(othervertex).remove(vertex);
            return true;
        }
        adjlist.remove(vertex);
        return false;
    }

}
