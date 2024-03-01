package Queues;

public class main {
    public static void main(String[] args) {
        queue newq = new queue(0);
//        newq.getfirst();
//        newq.getlast();
//        newq.getlength();

        //enqueue method:-
        newq.enqueue(1);
        newq.enqueue(2);
        newq.enqueue(3);
        newq.enqueue(4);
        newq.enqueue(5);


        //dequeue method:-
        newq.dequeue();



        newq.printqueue();


    }
}
