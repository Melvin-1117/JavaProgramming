class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DelElement {
    Node head;
    void insertEnd(int data){
        Node newNode = new Node(data);
                if(head == null){
                    head=newNode;
                    return;
                }
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
    }
    void deleteFirst(){
        if(head==null){
            System.out.print("List is empty");
        }else {
            head = head.next;
        }
    }
    void deleteEnd(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }
    void deletePos(int pos){
        if(pos==1){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos;i++){
            if(temp==null){
                System.out.print("Position doesnt exist");
                return;
            }
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String [] args){
        DelElement obj = new DelElement();
        obj.insertEnd(5);
        obj.insertEnd(15);
        obj.insertEnd(20);
        obj.insertEnd(25);
        obj.insertEnd(30);
        obj.deleteFirst();
//        obj.deleteEnd();
        obj.deletePos(2);
        obj.display();
    }
}
