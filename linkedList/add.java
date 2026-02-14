class add{
    Node head;
    private int size;
    add(){
        size=0;   //constructor for main class
    }
     class Node{ // a class can contain classes inside it
        String data;
        Node next;// Node class

        Node(String data){
            this.data=data;// constructor for class Node
            this.next=null;
            size++;
        }
    }
    
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    
    public void addlast(String data){
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

    public void removefirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
        size--;
    }

    public void removelast(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null){
            secondlast=secondlast.next;
            lastnode=lastnode.next;
        }
        secondlast.next=null;
    }
    public int getsize(){
        return size;
    }
    
    public void printlist(){
        if(head==null){
            System.out.print("list is empty");
        }
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data +"->");
            currnode=currnode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String []args){
        add list=new add();
    //classname objvar=new_keyword classname parenthesis;
    list.addfirst("a");
    list.addfirst("is");
    list.addfirst("this");
    list.printlist();
    list.addlast("list");
    list.printlist();
    System.out.println(list.getsize());
    list.removefirst();
    list.printlist();
    list.removelast();
    list.printlist();
    System.out.println(list.getsize());
    }
}