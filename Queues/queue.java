package Queues;


public class queue {
    private Node first;
    private Node last;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public queue(int value){
        Node newnode = new Node(value);
        first = newnode;
        last = newnode;
        length = 1;
    }

    public void printqueue(){
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.value);
            temp =temp.next;
        }
    }
    public void getfirst(){
        System.out.println("first: "+first.value);
    }
    public void getlast(){
        System.out.println("last: "+last.value);
    }
    public void getlength(){
        System.out.println("length: "+length);
    }

    public void enqueue(int value){
        Node newnode = new Node(value);
        if (length==0){
            first = newnode;
            last = newnode;
            length =1;
        }else{
            last.next = newnode;
            last = newnode;
            length++;
        }
    }

    public Node dequeue(){
        if (length == 0)return null;
        Node temp = first;

        if(length==1){
            first = null;
            last = null;
        }
        else {

            first = first.next;
            temp.next = null;

        }
        length--;
        return temp;

    }


}
