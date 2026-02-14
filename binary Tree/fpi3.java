import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
    }
}
class fpi3{
    static Node insert(String arr[]){
        if(arr.length==0 || arr[0].equals("-1"))
        return null;
        Node root=new Node(Integer.parseInt(arr[0]));
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i<arr.length){
            Node curr=q.remove();
            if(!arr[i].equals("-1")){
                curr.left=new Node(Integer.parseInt(arr[i]));
                q.add(curr.left);
            }
            i++;
            if(i>=arr.length)
            break;
            if(!arr[i].equals("-1")){
                curr.right=new Node(Integer.parseInt(arr[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    static void preorder(Node root){
        if(root==null)
        return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String arr[]=sc.nextLine().trim().split(" "); 
        //String arr=new String[] cannot use this alternative for the spilt method
        // since here we dont know n i  mean dont have n before we have to store it in string [n]
        if(arr.length ==0)
        return;  
        Node root=insert(arr);
        preorder(root);
    }


}

