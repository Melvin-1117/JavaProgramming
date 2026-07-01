import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SearchLL {
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
        int count=1;
        while(temp!=null){
            
            if(temp.data==val){
                System.out.println("Match found at "+ count);
                return;
            }temp=temp.next;
            count++;
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
        Scanner sc = new Scanner(System.in);
        SearchLL obj=new SearchLL();
        obj.insertEnd(5);
        obj.insertEnd(10);
        obj.insertEnd(15);
        obj.insertEnd(20);
        obj.display();
        obj.srch(sc.nextInt());
    }
}

