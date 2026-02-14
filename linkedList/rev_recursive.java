public class rev_recursive{
    Node head;
    class Node{
        String data;
        Node next;
    }
    Node(String data){
        this.data=data;
        this.next=null;
    }
    public void add(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        
    }

    public static void main(String []args){

    }
}
