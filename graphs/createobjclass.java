/*
 * a way of creating a graph vertices with out making the nested edge class static
 * and by creating an obj for outer class 
 * aslo static methods cannot use this keyword
 */
import java.util.*;
public class createobjclass{
    class edge{
        int src;
        int dest;
        edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public void creategraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(this.new edge(0,2));
        graph[1].add((this.new edge(1,2)));
        graph[1].add((this.new edge(1,3)));
        graph[2].add((this.new edge(2,0)));
        graph[2].add((this.new edge(2,1)));
        graph[2].add((this.new edge(2,3)));
        graph[3].add((this.new edge(3,2)));
        graph[3].add((this.new edge(3,1)));

    }
    public static void main(String []args){
        createobjclass obj=new createobjclass();
        int v=4;
        ArrayList<edge> graph[]=new ArrayList[v];
        obj.creategraph(graph);
        for(int i=0;i<graph[2].size();i++){
            edge e=graph[2].get(i);
            System.out.print(e.dest+ " ");
        }

    }
}