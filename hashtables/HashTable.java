package hashtables;

import java.util.ArrayList;

import static java.util.Objects.hash;

public class HashTable {
    private int size = 7;
    private Node[] datamap;

    class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.value = value;
            this.key = key;
        }


    }

    public HashTable(){
        datamap  = new Node[size];
    }

    public void printtable(){
        for (int i = 0; i<datamap.length;i++){
            System.out.println(i+":");
            Node temp = datamap[i];
            while(temp!=null){
                System.out.println("{"+temp.key+"="+temp.value+"}");

                temp = temp.next;

            }
        }

    }

    private int hash(String key){
        int hash = 0;
        char[] keychars = key.toCharArray();
        for (int i=0; i<keychars.length;i++){
            int asciivalue = keychars[i];
            hash = (hash+ asciivalue*23)% datamap.length;
        }
        return hash;
    }

    public void set(String key,int value){
        int index = hash(key);
        Node newnode = new Node(key,value);
        if (datamap[index]==null){
            datamap[index]=newnode;
        }
        else {
            Node temp = datamap[index];
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = datamap[index];
        while (temp!=null){
            if (temp.key==key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys(){
        ArrayList<String> allkeys = new ArrayList<>();
        for (int i = 0;i< datamap.length;i++){
            Node temp = datamap[i];
            while(temp!=null){
                allkeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allkeys;
    }

}
