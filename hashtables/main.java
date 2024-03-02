package hashtables;

public class main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();

        //change in repo

        ht.set("nails",20);
        ht.set("paint",450);
        ht.set("tiles",23);

        System.out.println(ht.get("nails"));
        System.out.println(ht.get("lumber"));

    }
}
