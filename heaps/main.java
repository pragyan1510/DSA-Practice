package heaps;

public class main {
    public static void main(String[] args) {
        heaps myheap = new heaps();
        myheap.insert(99);
        myheap.insert(75);
        myheap.insert(80);
        myheap.insert(55);
        myheap.insert(60);
        myheap.insert(50);
        myheap.insert(65);

        System.out.println(myheap.getHeap());


        myheap.remove();

        System.out.println(myheap.getHeap());

        myheap.remove();
        System.out.println(myheap.getHeap());


        /*
        expected output:
        [99,75,80,55,60,50,65]
        [80,75,65,55,60,50]
        [75,60,65,55,50]
         */


//        myheap.insert(100);
//        System.out.println(myheap.getHeap());
//
//        myheap.insert(75);
//
//        System.out.println(myheap.getHeap());

        /*expected output
        [99,72,68,56]
        [100,99,68,56,72]
        [100,99,75,56,72,68]
         */






    }
}