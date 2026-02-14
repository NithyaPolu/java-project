import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
    }
}
class fpi8{
    public Node insert(int arr[],int n){
        Queue<Node> q=new LinkedList<>();
        Node root=new Node(arr[0]);
        q.add(root);
        int i=1;
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
    public int leafnodesum(Node root){
        if(root==null)
        return 0;
        if(root.right==null && root.left==null)
        return root.data;
        return leafnodesum(root.left)+leafnodesum(root.right);
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        fpi8 m=new fpi8();
        Node root=m.insert(arr,n);
        System.out.print(m.leafnodesum(root));
    }
}