import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(int d){
        data=d;
    }
}
class fpi9{
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
    public static void zigzag(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean ltor=true;
        while(!q.isEmpty()){
           int size=q.size();
           int arr[]=new int[size];
           for(int i=0;i<size;i++){
            Node curr=q.remove();
            int idx=0;
            if(ltor==true)
                idx=i;
            else
                idx=size-1-i;
            
                arr[idx]=curr.data;
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
           }
           for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");

           }
           ltor=!ltor;
           System.out.println();
        }
    }
        public static void main(String[] args){
    
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i<n;i++)
        {
          arr[i] = sc.nextInt();
        }
      
      Node root = insert(arr,n); //1000
      zigzag(root);
    }
    }
