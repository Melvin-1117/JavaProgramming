class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}public class LinkedList {
    Node head;
    void InsertFront(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void InsertEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void InsertPos(int data,int pos){
        Node newNode = new Node(data);
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void display() {
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String [] args) {
        LinkedList obj = new LinkedList();
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        obj.head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        obj.InsertFront(5);
        obj.InsertEnd(50);
        obj.InsertPos(15,3);
        obj.display();
    }
}