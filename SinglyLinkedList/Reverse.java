class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Reverse {
    Node head;
    void reverse(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        Node temp=head;
        Node prev=null;
        Node next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args){
        Reverse obj = new Reverse();
        Node node1= new Node(10);
        Node node2= new Node(20);
        Node node3= new Node(30);
        Node node4= new Node(40);
        Node node5= new Node(50);
        obj.head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        obj.reverse();
        obj.display();
    }
}
