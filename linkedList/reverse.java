 //using iterative form
 import java.util.*;
 class reverse{
    Node head;
    class Node{
        String data;
        Node next;
    
    Node(String data){
        this.data=data;
        this.next=null;
    }

}

public void add(String data){
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
        return;
    }
    Node currnode=head;
    while(currnode.next!=null){
        currnode=currnode.next;
    }
    currnode.next=newnode;
}
public void printlist(){//common for every process whether reversing or delete or add
    if(head==null){//used for updating or moving the head by forming a 
        System.out.println("list is empty");
        return;
 //fake currnode node instead of new node which results in deletion of previous node       
    }
    Node currnode=head;
    while(currnode!=null){
        System.out.print(currnode.data + "->");
        currnode=currnode.next;
    }
    System.out.println("NULL");

}

public void reverselist(){
    if(head==null || head.next==null){
        return;
    }
    Node prevnode=head;
    Node currnode=head.next;
    while(currnode!=null){
        Node nextnode=currnode.next;
        currnode.next=prevnode;

        // update
        prevnode=currnode;
        currnode=nextnode;
    }
    head.next=null;// to terminate the only line b\w 4 and 5
    head=prevnode;
}
public static void main(String[] args){
    reverse list=new reverse();
     list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.printlist();
    list.reverselist();
    list.printlist();
}
 }