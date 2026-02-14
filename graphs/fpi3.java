import java.util.*;
public class fpi3 {
    static class edge{
        int src;
        int dest;
        edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
       int V=sc.nextInt();
       int E=sc.nextInt();
       ArrayList<edge> graph[]=new ArrayList[V];
       for(int i=0;i<V;i++){
        graph[i]=new ArrayList<>();
       }
       for(int i=0;i<E;i++){
        int u=sc.nextInt()-1;
        int v=sc.nextInt()-1;
        graph[u].add(new edge(u,v));
        graph[v].add(new edge(v,u));
       }
       //BFS
       int start=sc.nextInt()-1;
       Queue<Integer> q=new LinkedList<>();
       boolean vis[]=new boolean[V];
       q.add(start);

       while(!q.isEmpty()){
        int curr=q.remove();
        if(!vis[curr]){
            System.out.print((curr+1) +" ");
            vis[curr]=true;

            for(int i=0;i<graph[curr].size();i++){
                edge e=graph[curr].get(i);
                q.add(e.dest);
                /*
                 * since here inside q.add right so
                 * we get error if "" this written
                 * since adding right it becomes a string
                 */
            }
            }
            
        }
       }
    }
/*
 * ✔ Before queue (on push)	!vis[e.dest]
✔ Inside loop (on pop)_marked	!vis[curr]
 */



    // BFS OTHER FORM
    /*
    int start=sc.nextInt();
    Queue<Integer> q=new LinkedList<>();
       boolean vis[]=new boolean[V];
       q.add(start);
       vis[start]=true;
       while(!q.isEmpty()){
       int curr=q.remove();
       System.out.print(curr+ " ");

       for(int i=0;i<graph[curr].size();i++){
       edge e=graph[curr].get(i);
       if(!vis[e.dest]){
       vis[e.dest]=true;
       q.add(e.dest);
       }

       }
       
       }
    
     */

