import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
    }
}
class fpi4{
    public Node insert(int arr[],int n){
        Queue<Node> q=new LinkedList<>();
        Node root=new Node(arr[0]);
        q.add(root);
        int i=0;
        while(!q.isEmpty() && i<n){
            Node curr=q.remove();
            curr.left=new Node(arr[i]);
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
    public int count(Node root){
        if(root==null)
        return 0;
         int cl=count(root.left);
        int cr=count(root.right);
        return 1+cl+cr;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        fpi4 f=new fpi4();
        Node root=f.insert(arr,n);
       System.out.print( f.count(root));;
    }
}
