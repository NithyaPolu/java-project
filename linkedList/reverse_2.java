import java.util.*;
public class reverse_2{
    Node head;
   class Node{
    String data;
    Node next;
   }
   public void reverseIterate(String data){
    Node prevnode=head;
    Node currnode=head.next;
    while(currnode!=null){
        Node nextnode=currnode.next;
        prevnode=currnode;
        currnode=nextnode;
    }
   }
}