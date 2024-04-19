package BinarySearchTrees;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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

    private boolean rcontains(Node currentNode, int value){
        if (currentNode==null)return false;
        if (currentNode.value == value) return true;
        if (value<currentNode.value){
            return rcontains(currentNode.left,value);
        }else{
            return rcontains(currentNode.right,value);
        }

    }
    public boolean rcontains(int value){
        return  rcontains(root,value);
    }



    private Node rinsert(Node currentNode,int value){
        if(currentNode==null)return new Node(value);
        if (value<currentNode.value){
            currentNode.left = rinsert(currentNode.left,value);
        } else if (value>currentNode.value) {
            currentNode.right = rinsert(currentNode.right,value);
        }
        return currentNode;
    }

    public void rinsert(int value){
        if(root==null)root = new Node(value);
        rinsert(root,value);
    }


    private Node deletenode(Node currentNode,int value){
        if(currentNode==null)return null;
        if(value<currentNode.value){
            currentNode.left = deletenode(currentNode.left,value);
        } else if (value>currentNode.value) {
            currentNode.right = deletenode(currentNode.right,value);
        }
        else {
            if (currentNode.left==null && currentNode.right==null){
                return null;
            } else if (currentNode.left==null) {
                currentNode = currentNode.right;

            } else if (currentNode.right==null) {
                currentNode = currentNode.left;
            }
            else {
                int subtreemin = minValue(currentNode.right);
                currentNode.value = subtreemin;
                currentNode.right = deletenode(currentNode.right,subtreemin);
            }
        }
        return currentNode;
    }

    public int minValue(Node currentNode){
        while (currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void deletenode(int value){
        deletenode(root,value);
    }


    public ArrayList<Integer> BFS(){
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while(queue.size()>0){
            currentNode = queue.remove();
            results.add(currentNode.value);

            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if (currentNode.right!=null){
                queue.add((currentNode.right));
            }
        }
        return results;
    }

    public ArrayList<Integer> DFSpreorder(){
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){
                results.add(currentNode.value);
                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                if (currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }

    public ArrayList<Integer> DFSpostorder(){
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){
                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                if (currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }
        new Traverse(root);
        return results;
    }

    public ArrayList<Integer> DFSinorder(){
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){
                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right!=null){
                    new Traverse(currentNode.right);
                }

            }
        }
        new Traverse(root);
        return results;
    }



}
