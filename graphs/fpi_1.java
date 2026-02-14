import java.util.*;
public class fpi_1 {
    public static void  main(String []args){
    Scanner sc=new Scanner(System.in);
   int  V=sc.nextInt();
    int E=sc.nextInt();
    int adjmat[][]=new int[V][V];
    for(int i=0;i<E;i++){
        int u=sc.nextInt()-1;
        int v=sc.nextInt()-1;
        adjmat[u][v]=1;
    }
    for(int i=0;i<V;i++){
        for(int j=0;j<V;j++){
            System.out.print(adjmat[i][j]+" ");
        }
         System.out.println();
    }
   
    }
}
