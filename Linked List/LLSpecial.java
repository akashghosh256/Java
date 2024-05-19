
import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }


}






class LinkedList{

    Node head;
    public LinkedList(){
        head = null;
    }
// creating linkedList 
    public void addNode(int data){
        Node newNode = new Node(data);
        if( head == null){
            head = newNode;
        }else{
            Node cur = head;
            while( cur.next != null){
                cur = cur.next;
            }
            cur.next = newNode;
        }

    }
// find mid - tortoise method
    public void mid(){
       Node slow=head, fast = head;
       while(fast.next != null){
slow = slow.next;
fast = fast.next.next;
       }
       System.out.println("mid: "+ slow.data);
    }


    // reversing
    Node rev(Node head){
        if( head == null || head.next == null) return head;
        Node newHead= rev(head.next);
        Node front = head.next;
        front.next =  head;
        head.next = null;
        return newHead;
    
    }

    // 






public void print(){
Node temp =head;
while(temp!=null){
    System.out.println(temp.data);
    temp = temp.next;

}

    }


}



public class LLSpecial{
    public static void main (String args[]){
        LinkedList list = new LinkedList();
        list.addNode(44);
        list.addNode(55);
        list.addNode(556);
        list.print();
        list.mid();
        list.head = list.rev(list.head); //reverses
        System.out.println("reverse");
list.print();



    }
}




















