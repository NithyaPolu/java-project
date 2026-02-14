import java.util.*;
class Node
  {
    int data;
    Node left;
    Node right;
    public Node(int val)
    {
      data = val;
    }
  }
  class fpi2{
  public static Node bst(Node root,int val){
    if(root==null)
    return new Node(val);
    else if(val<root.data)
    root.left=bst(root.left,val);
    else if(val>root.data)
    root.right=bst(root.right,val);

    return root;
  }
  public static  Node search(Node root ,int key){
    if(root==null || root.data==key)
    return root;
    else if(key<root.data)
    return search(root.left,key);
    else
    return search(root.right,key);
  }
  public static void inorder(Node root){
    if(root==null)
    return;
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Node root=null;
    for(int i=0;i<n;i++){
        int val =sc.nextInt();
        root=bst(root,val);
    }
    int key=sc.nextInt();
    Node root1=search(root,key);
    if(root1 == null)
        System.out.print("Book not found");
      else
      {
        System.out.println("Book found! Subtree rooted at "+key+":");
      inorder(root1);
      }

  }
}
