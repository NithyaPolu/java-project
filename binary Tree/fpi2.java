import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(int d){
        data=d;
        
    }
}
class fpi2{
    public Node insert(String arr[],int n){
        Queue<Node> q=new LinkedList<>();
        Node root=new Node(Integer.parseInt(arr[0]));
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i<n){
            Node curr=q.remove();
            if(!arr[i].equals("null")){
                curr.left=new Node(Integer.parseInt(arr[i]));
                q.add(curr.left);
            }
            i++;
            if(i<n && !arr[i].equals("null")){
                curr.right=new Node(Integer.parseInt(arr[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public void inorder(Node root){
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /// if we use split(" ") we have to for sure
        /// // use sc.nextLine() method
        //sc.nextLine();
        //String arr[]=sc.nextLine().split(" ");
                //OR
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        fpi2 f=new fpi2();
        Node root=f.insert(arr,n);
        f.inorder(root);
    }
}