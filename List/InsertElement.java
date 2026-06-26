class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertElement {
    Node head;
    void insertFront(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void insertEnd(int data){
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
    void insertPos(int data,int pos){
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
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }System.out.print("NUll");
    }
    public static void main(String [] args){
        InsertElement obj = new InsertElement();
        obj.insertEnd(5);
        obj.insertEnd(10);
        obj.insertEnd(15);
        obj.insertEnd(20);
        obj.insertPos(17,2);
        obj.display();
    }
}
