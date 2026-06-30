class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class FindMid {
    Node head;
    Node secondmid(){
        Node temp=head;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }return slow;
    }
    Node mid(){
        Node temp1=head;
        int count=0;
        while(temp1!=null){
            temp1=temp1.next;
            count++;
        }
        Node slow=head;
        Node fast=head;
        if(count%2==1) {
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }return slow;
        }else{
            while (fast != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }return slow;
        }

    }
    void display(){
    }
    public static void main(String [] args){
        FindMid obj = new FindMid();
        Node node1=new Node(5);
        Node node2=new Node(10);
        Node node3=new Node(15);
        Node node4=new Node(20);
        Node node5=new Node(25);
        obj.head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
       node4.next=node5;
        Node middle=obj.mid();
        System.out.print(middle.val);
        obj.display();
    }

}
