import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(int d){
        data=d;
    }
}
class fpi5{
    static Node insert(int arr[],int n){
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
    static int height(Node root){
        if(root==null)
        return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node root=insert(arr,n);
        System.out.print( height(root));
       
    }
}