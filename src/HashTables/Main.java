package HashTables;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 1000);
        myHashTable.set("hammers", 1000);
        myHashTable.set("screws", 1000);
        myHashTable.set("stuff", 1000);
        myHashTable.set("testing", 1000);

        myHashTable.printTable();

        System.out.println(myHashTable.get("stuff"));

        System.out.println(myHashTable.keys());


    }
}
