class ll{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public  void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    public  void addlast(String data){
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
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
    Node currnode=head;
    while(currnode!=null){
        System.out.print(currnode.data + "->");
        currnode=currnode.next;
    }
    
    System.out.println("NULL");
    
   // System.out.println("");//to get next line 
    //not b/w words of same line but from different lines
}


    public static void main(String [] args){
        ll list=new ll();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();
        list.addlast("list");
        list.printlist();
        list.addfirst("this");
        list.printlist();
    }
}