package BinarySearchTrees;

import java.util.Scanner;

public class BinarySearchTrees {
    Node root;

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value=value;
        }
    }

    public boolean Insertbst(int value){
        Node newnode = new Node(value);
        if(root==null){
            root = newnode;
            return true;
        }

        Node temp = root;

        while(true){
            if (newnode.value==temp.value)return false;
            if(newnode.value<temp.value){
                if (temp.left==null){
                    temp.left = newnode;
                    return true;
                }
                temp = temp.left;

            }else{
                if (temp.right==null){
                    temp.right = newnode;
                    return true;
                }
                temp = temp.right;
            }

        }
    }

    public boolean contain(int value){
        if (root==null) return false;
        Node temp = root;
        while(temp!=null){
            if (value<temp.value){
                temp.left = temp;
            } else if (value>temp.value) {
                temp.right = temp;

            }else {
                return true;
            }




        }
        return false;
    }

}
