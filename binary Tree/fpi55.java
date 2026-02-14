
import java.util.*;
class Node
  {
    int data;
    Node left;
    Node right;
    public Node(int d)
    {
      data = d;
    }
  }
  class fpi55{
    public  static Node insert(String arr[],int n)
    {
      Queue<Node> q = new LinkedList<>();
      Node root = new Node(Integer.parseInt(arr[0]));
      q.add(root);
      int i = 1;
     while(!q.isEmpty() && i<n){
        if(!arr[i].equals("null")){        
        Node curr=q.remove();
        curr.left=new Node(Integer.parseInt(arr[i]));
        q.add(curr.left);
        i++;
        if(!arr[i].equals("null") && i<n){
            curr.right=new Node(Integer.parseInt(arr[i]));
            q.add(curr.right);
        }
        i++;
     }
    }
    return root;
    }

    public static int height(Node root)
    {
      if(root == null)
        return 0;
      int lh=height(root.left);
      int rh=height(root.right);
      return 1+ Math.max(lh,rh);
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=sc.nextLine().trim().split(" ");
        Node root=insert(arr,n);
       System.out.print( height(root));

    }
}