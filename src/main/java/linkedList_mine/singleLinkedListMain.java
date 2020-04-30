package linkedList_mine;

public class singleLinkedListMain {
    public static void main(String [] args) {
        singleLinkedList list = new singleLinkedList();
        list.createSingleLinkedList(5);
        list.traverseLinkedList();

        list.insertInLinkedList(10,1);
        //list.traverseLinkedList();
        list.insertInLinkedList(20,2);
        list.traverseLinkedList();
        list.insertInLinkedList(30,3);
        list.traverseLinkedList();
        list.insertInLinkedList(40,4);
        list.traverseLinkedList();
        list.insertInLinkedList(50,5);

        System.out.println("Size:"+list.getSize());
        System.out.println();

        System.out.println("Searching for element 40");
        list.searchNode(40);

        System.out.println("Searching for value 500");
        list.searchNode(500);

        System.out.println("\n \nDeleting the node at location 0");
        System.out.println("Before Deletion");
        list.traverseLinkedList();
        list.deletionOfNode(0);
        System.out.println("After Deletion");
        list.traverseLinkedList();
        System.out.println();

        System.out.println("\n \nDeleting the node at location 4");
        System.out.println("Before Deletion");
        list.traverseLinkedList();
        list.deletionOfNode(4);
        System.out.println("After Deletion");
        list.traverseLinkedList();
        System.out.println();

        list.deleteLinkedList();
        list.traverseLinkedList();
    }
}
