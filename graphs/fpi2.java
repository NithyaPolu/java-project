import java.util.*;
public class fpi2 {
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
            graph[i]=new ArrayList<>(); // for vertices and initializing the empty arraylists
        }
        for(int i=0;i<E;i++){
            int u=sc.nextInt()-1;
            int v=sc.nextInt()-1;
            graph[u].add(new edge(u,v));  // city numbers for rows and columns using edges 
            graph[v].add(new edge(v,u));// and creating graph and by dafault the 
            //values are initialized as 0
        }
        /*for(int i=0;i<V;i++){
            System.out.print("city"+i+1+":");
            for(int j=0;j<graph[i].size();j++){
                edge e=graph[i].get(j);
                System.out.print(e.dest+1 + " ");
            }
            System.out.println();
        }
       */
         //(OR)
          for(int i=0;i<V;i++){
          System.out.print("city"+ i+1 +" :");
            for(edge e: graph[i]){
          System.out.print(e.dest+1 +" ");

          }
          System.out.println();
           }
          
         
    }
}
