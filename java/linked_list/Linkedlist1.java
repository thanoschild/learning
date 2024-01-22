class Node {
    int data;
    Node next;


    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class Linkedlist1 {

    Node head;
    public Linkedlist1() {
       this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while(last.next != null) last = last.next;
        last.next = newNode;
    }

    public void display() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Linkedlist1 myList = new Linkedlist1();
        myList.append(1);
        myList.append(7);
        myList.append(4);
        myList.append(7);
        myList.append(9);

        myList.display();
    }
}