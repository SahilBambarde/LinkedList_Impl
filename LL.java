public class LL {
    // name of the class is LL because class LinkedList is already present in java

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add
    //first add
    //add last

    Node head;
    private int size;

    LL(){
        size=0;
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
        //size++;
    }

    //add - last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        //size++;
    }


    //print
    public void printList() {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
        }
        head= head.next;
        size--;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is Empty");
        }
        size--;
        if(head.next==null){
            head=null;
        }
        Node secondLast=head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize() {
        return size;
    }


    public static void main(String[] args){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");


        list.addLast("list");

        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.addFirst("this");
        System.out.println(list.getSize());
    }
}
