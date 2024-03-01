package stacks;

public class main {
    public static void main(String[] args) {
        stack mystack = new stack(3);
        mystack.push(2);
        mystack.push(1);
        mystack.push(5);
        mystack.push(6);

        mystack.pop();

        mystack.printstack();
    }
}
