package stacks;

public class stack {
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

        public stack(int value) {
            Node newnode = new Node(value);
            top = newnode;
            height = 1;
        }

        public void printstack(){
            Node temp = top;
            while(temp!=null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }

        public void gettop(){
            System.out.println("top: "+ top);
        }
        public void getheight(){
            System.out.println("height: "+height);
        }

        public void push(int value){
        Node newnode = new Node(value);
        if(height==0){
            top =newnode;

        }else {
            newnode.next = top;
            top = newnode;
        }
        height++;
        }

        public Node pop(){
        if (height==0) return null;
        Node temp = top;
        top = top.next;
        temp.next =null;
        height--;
        return temp;
        }
    }


