class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Search {
    Node head;
    void insertEnd(int data){
        Node newNode= new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }temp.next=newNode;
    }
    void srch(int val){
        Node temp=head;
        while(temp!=null){
            
            if(temp.data==val){
                System.out.println("Match found"+val);
                return;
            }temp=temp.next;
        }
        System.out.print("Element not fount");
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
        Search obj=new Search();
        obj.insertEnd(5);
        obj.insertEnd(10);
        obj.insertEnd(15);
        obj.insertEnd(20);
        obj.srch(10);
        obj.display();
    }
}

