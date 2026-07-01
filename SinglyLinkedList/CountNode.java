class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class CountNode {
    Node head;
    int count=0;
    void count(){
        if(head ==null){
            System.out.print("No elements found, hence count is zero");
        }
        else {
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
        }
        System.out.print("the number of elements: "+count);
    }
    public static void main(String [] args){
        CountNode obj=new CountNode();
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        obj.head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        obj.count();
    }
}
