package linkedList_mine;

public class singleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Node createSingleLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.setValue(nodeValue);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.setValue(nodeValue);
        if(!existsLinkedList()) {
            System.out.println("The linked list does not exist!!");
            return;
        } else if (location == 0) {
            node.setNext(head);
            head = node;
        } else if (location >= size) {
            node.setNext(null);
            tail.setNext(null);
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location -1) {
                tempNode = tempNode.getNext();
                index ++;
            }
            Node nextNode = tempNode.getNext();
            tempNode.setNext(node);
            node.setNext(nextNode);
        }
        setSize(getSize()+1);
    }

    public boolean existsLinkedList() {
        return head != null;
    }

    void traverseLinkedList() {
        if(existsLinkedList()) {
            Node tempNode = head;
            for(int i =0;i<getSize();i++) {
                System.out.print(tempNode.getValue());
                if(i != getSize() - 1) {
                    System.out.println(" -> ");
                }
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.println("Linked list does not exists !");
        }
        System.out.println("\n");
    }

    void deleteLinkedList() {
        System.out.println("Deleting the linked list");
        head = null;
        tail = null;
        System.out.println("Linked list deleted successfully");
    }

    boolean searchNode(int nodeValue) {
        if(existsLinkedList()) {
            Node tempNode = head;
            for(int i=0; i<getSize();i++) {
                if(tempNode.getValue() == nodeValue) {
                    System.out.print("Found the node at location " + i + "\n");
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.print("Node not found");
        return false;
    }

    public void deletionOfNode(int location) {
        if(!existsLinkedList()) {
            System.out.println("The linked list does not exist");
            return;
        } else if (location == 0) {
            head =  head.getNext();
            setSize(getSize() - 1);
            if(getSize() == 0) {
                tail = null;
            }
        } else if (location >= getSize()) {
            Node tempNode = head;
            for(int i = 0;i<size -1;i++) {
                tempNode = tempNode.getNext();
            }
            if(tempNode == head) {
                tail = head = null;
                setSize(getSize() - 1);
                return;
            }
            tempNode.setNext(null);
            tail = tempNode;
            setSize(getSize() - 1);
        } else {
            Node tempNode = head;
            for(int i=0;i<location-1;i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize() - 1);
        }
    }
}
