import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
    }
}
class sample{
    public Node insert(int arr[],int n){
        Queue<Node> q=new LinkedList<>();
        Node root=new Node(arr[0]);
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i<n){
            Node curr=q.remove();
            curr.left= new Node(arr[i]);
            q.add(curr.left);
            i++;
        if(i<n){
            curr.right=new Node(arr[i]);
            q.add(curr.right);
        }
        i++;
    }
    return root;
       }
    public void bfs(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.remove();
            System.out.print(curr.data + " ");
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
        }

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sample s=new sample();//obj creation for the class 
        Node root=s.insert(arr,n);
        s.bfs(root);
    }
}